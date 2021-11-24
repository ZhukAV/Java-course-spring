package edu.ntu.sau.zhuk.springapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String init(Model model) {
        model.addAttribute("name", "Andrii Zhuk");
        return "index";
    }

    @GetMapping("/ZSU")
    public String initIndex(Model model) {
        return "ZSU";
    }
}
