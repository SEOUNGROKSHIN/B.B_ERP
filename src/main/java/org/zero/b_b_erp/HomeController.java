package org.zero.b_b_erp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "신승록");
        return "index"; // layout.html이 전체 틀
    }
}

