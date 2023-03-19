package baitap.controller;

import baitap.entitty.Customer;
import baitap.service.CustomerService;
import baitap.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping(value = "/list")
    public String home(Model model) {
        model.addAttribute("customer", new Customer());
        return "list";
    }

    @PostMapping(value = "/save")
    public ModelAndView save(@ModelAttribute Customer customer) {
        customerService.save(customer);
        List<Customer> customerList = customerService.display();
        ModelAndView modelAndView = new ModelAndView("save", "list", customerList);
        return modelAndView;

    }
}
