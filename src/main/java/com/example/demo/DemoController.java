package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类注释
 */
@Controller
@RequestMapping(value = "/")
public class DemoController {

    @RequestMapping({"/hello","/"})
    public String test(Model model) {
        String welcome = "你好！";
        model.addAttribute("welcomeString", welcome);
        return "home";
    }


}
