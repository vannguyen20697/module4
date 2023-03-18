package codegym.music2.controller;

import codegym.music2.entity.Music;
import codegym.music2.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/musics")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("")
    public String displayList(Model model) {
        model.addAttribute("musics", musicService.findAll());
        return "music/list";
    }

    @GetMapping("/create")
    public String  showCreateForm(Model model){
        model.addAttribute("music",new Music());
        return "music/create";
    }
    @PostMapping("/create")
    public  String doCreate(@ModelAttribute Music music, Model model, RedirectAttributes rd){
        musicService.create(music);
        rd.addFlashAttribute("message","tao thanh cong");
        return "redirect:/musics";
    }
    @GetMapping("/update")
    public String  showUpdateForm(@RequestParam String musicNo, Model model){
        model.addAttribute("music",musicService.findById(musicNo));
        return "music/update";
    }
    @PostMapping("update")
    public String doUpdate(@ModelAttribute Music music, Model model, RedirectAttributes rd){
        musicService.update(music);
        rd.addFlashAttribute("message","update thanh cong");
        return "redirect:/musics";
    }
    @GetMapping("/delete")
    public String  showDeleteForm(@RequestParam String musicNo, Model model){
//        musicService.findById(musicNo);
        musicService.delete(musicService.findById(musicNo));
        return "music/delete";
    }


}
