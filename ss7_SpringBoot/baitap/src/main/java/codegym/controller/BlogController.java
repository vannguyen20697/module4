package codegym.controller;

import codegym.entity.Blog;
import codegym.entity.Category;
import codegym.service.BlogService;
import codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping(value = "")
    public String list(Model model) {
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogs", blogs);
        return "blog/list";
    }
    @GetMapping("/create")
    public String viewCreate(Model model) {
        List<Category> categories = categoryService.findAll();
        Blog blog = new Blog();
        blog.setCategory(new Category());
        model.addAttribute("blog", blog);
        model.addAttribute("categories", categories);
        return "/blog/create";
    }

//    @PostMapping("/create")
//    public String create(@Valid @ModelAttribute("student") Student student,
//                         BindingResult bindingResult, Model model) {
//        StudentValidate validate = new StudentValidate();
//        validate.validate(student, bindingResult);
//        if (bindingResult.hasErrors()) {
//            List<ClassName> classNames = classNameService.findAll();
//            model.addAttribute("classNames", classNames);
//            if (student.getClassName() == null) {
//                student.setClassName(new ClassName());
//            }
//            return "/student/create";
//        }
//        service.create(student);
//        return "redirect:/student/list";
//    }

}
