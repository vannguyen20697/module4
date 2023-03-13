package baitap.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverter {

    @GetMapping("/convert/index")
    public String index() {
        return "convert/index";
    }

    @PostMapping("/usd")
    public String submit(@RequestParam String usd, Model model) {
        float result = Float.parseFloat(usd)*23000;
        model.addAttribute("result1", result);
        return "convert/submit";
    }
}

