package codegym.blog.controller;

import codegym.blog.entity.Blog;
import codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public String displayList(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "blog/list";
    }
    @GetMapping("/create")
    public String  showCreateForm(Model model){
        model.addAttribute("blog",new Blog());
        return "blog/create";
    }
    @PostMapping("/create")
    public  String doCreate(@ModelAttribute Blog blog, Model model, RedirectAttributes rd){
        blogService.create(blog);
        rd.addFlashAttribute("message","tao thanh cong");
        return "redirect:/blogs";
    }
    @GetMapping("/update")
    public String  showUpdateForm(@RequestParam String blogNo, Model model){
        model.addAttribute("blog",blogService.findById(blogNo));
        return "blog/update";
    }
    @PostMapping("update")
    public String doUpdate(@ModelAttribute Blog blog, Model model, RedirectAttributes rd){
        blogService.update(blog);
        rd.addFlashAttribute("message","update thanh cong");
        return "redirect:/blogs";
    }
    @GetMapping("/delete")
    public String  showDeleteForm(@RequestParam String blogNo, Model model){
//        blogService.findById(blogNo);
        System.out.println(blogNo);
        Blog blog =blogService.findById(blogNo);
        System.out.println(blog.getBlogNo());
        blogService.delete(blog);
        return "redirect:/blogs";
    }
}
