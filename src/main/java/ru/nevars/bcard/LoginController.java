package ru.nevars.bcard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/bcard")
public class LoginController {

    @RequestMapping(value = "/t")
    public String loadTemp() {
        return "temp";
    }
}
