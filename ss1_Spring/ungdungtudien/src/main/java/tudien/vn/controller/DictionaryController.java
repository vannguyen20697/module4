package tudien.vn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tudien.vn.model.Dictionary;
import tudien.vn.service.DictionaryService;
import tudien.vn.service.DictionaryServiceImpl;

import java.util.List;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/search")
    public String index() {
        return "convert/index";
    }

    @PostMapping("/result")
    public String submit(@RequestParam String keyword, Model model) {
        List<Dictionary> dictionaries = dictionaryService.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getAnh())) {
                model.addAttribute("word", dictionaries.get(i).getViet());
                model.addAttribute("key", keyword);
                return "convert/submit";
            }
        }
        return "convert/submit";
    }
}
