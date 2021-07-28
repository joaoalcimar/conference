package alcimar.com.br.conference.controller;

import alcimar.com.br.conference.model.RegistrationModel;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration") RegistrationModel registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute ("registration") RegistrationModel registration){
        System.out.println("Registration: " + registration.getName());
        return "registration";
    }
}
