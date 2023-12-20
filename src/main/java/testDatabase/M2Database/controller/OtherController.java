package testDatabase.M2Database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OtherController {

    @GetMapping("/hello")
    public String getHello(@RequestParam(defaultValue = "Word") String name, Model model) {
       model.addAttribute("name",name);
        return "hello";
    }

}
