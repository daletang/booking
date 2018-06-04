package com.todsoft.booking.controller;

import com.todsoft.booking.template.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String starter(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "starter";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
}
