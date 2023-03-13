package baitap.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    @RequestMapping("/list")
    public String list() {

        return "/list";
    }


    @PostMapping("/save")
    public String save(
            @RequestParam("condiment") String[] condiment,
            ModelMap modelMap
    ) {
        modelMap.addAttribute("condiment", condiment);
        return "/save";
    }
}
