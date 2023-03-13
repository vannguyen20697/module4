package baitap2.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/show")
    public String showCal(){
        return "/list";
    }

    @PostMapping ("/display")
    public String calculate(Model model, @RequestParam double number1,
                            @RequestParam double number2,
                            @RequestParam  String cal ){

        double result = 0;
        switch (cal) {
            case "Addition(+)":
                result = number1 + number2;
                cal = "Addition";
                break;
            case "Subtraction(-)":
                result = number1 - number2;
                cal = "Subtraction";
                break;
            case "Multiplication(X)":
                result = number1 * number2;
                cal = "Multiplication";
                break;
            case "Division(/)":
                result = number1 / number2;
                cal = "Division";
                break;
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("cal", cal);
        model.addAttribute("result", result);
        return "/list";
    }

}
