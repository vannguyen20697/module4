package codegym.blog2.controller;

import codegym.blog2.model.Blog;
import codegym.blog2.repository.CategoryRepository;
import codegym.blog2.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryRepository categoryRepository;


    @GetMapping("/create")
    public String displayCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories", categoryRepository.findAll());
        return "book/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog, Model model) {
        blogService.save(blog);
        return "redirect:/blog/list";
    }


    @GetMapping("")
    public String showListBlog(@RequestParam(name = "nameBlog", required = false) String name, Model model) {
        if (name != null && !name.isEmpty()) {
            model.addAttribute("blogs", blogService.findByTittle(name));
        } else {
            model.addAttribute("blogs", blogService.getList());
        }
        return "blog/list";
    }
    @GetMapping("/listPaging")
    public String showListBlogPaging(
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "size", required = false, defaultValue = "3") int size,
            @RequestParam(name = "sort", required = false, defaultValue = "ASC") String sort,
            Model model) {
        Sort order = null;
        if (sort.equals("ASC")) {
            order = Sort.by("name").ascending();
        } else if (sort.equals("DESC")) {
            order = Sort.by("name").descending();
        }

        Pageable pageable = PageRequest.of(page - 1, size, order);

        model.addAttribute("blogs", blogService.findAll(pageable));
        return "blog/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") int blog_id, Model model) {
        model.addAttribute("blog", blogService.getBlogById(blog_id));
        return "blog/detail";
    }

}
