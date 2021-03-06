package alcimar.com.br.conference.controller;

import alcimar.com.br.conference.model.UserModel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @GetMapping("/user")
    public UserModel getUser(@RequestParam(value = "firstName", defaultValue = "SuperDude") String firstName,
                             @RequestParam(value = "lastName", defaultValue = "Poggers") String lastName,
                             @RequestParam(value = "age", defaultValue = "20") int age) {
        UserModel user = new UserModel();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public UserModel postUser(UserModel user){
        System.out.println("User firstname:" + user.getFirstName());

        return user;
    }


}
