package email.controller;

import email.model.Email;
import email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/email")
public class EmailController {
    private EmailService emailService;
    // constructor injection
    @Autowired
    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }
    @GetMapping("")
    public String displayList(Model model){
        model.addAttribute("email", emailService.findAll());
        return "/email/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model) {
        Email email = new Email();
        String[] langueges = new String[] {"English", "Vietnamese", "Japanese","Chinese"};
        String[] pageSize = new String[] {"5", "10", "15","25","50","100"};
        model.addAttribute("email", email);
        model.addAttribute("langueges", langueges);
        model.addAttribute("pageSize", pageSize);
        return "email/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute(name = "email") Email email, Model model, RedirectAttributes rd) {
        emailService.createEmail(email);
        rd.addFlashAttribute("message", "Thêm mới email thành công");
        return "redirect:/email/list";
    }

    @GetMapping("/edit")
    public String showUpdate(@RequestParam String id, Model model) {
        Email email = emailService.getId(id);
        model.addAttribute("email",email);
        return "email/edit";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute(name = "email") Email email, Model model, RedirectAttributes rd) {
        emailService.updateEmail(email);
//        rd.addFlashAttribute("message", "Update email thành công");
        return "redirect:/email";
    }
}
