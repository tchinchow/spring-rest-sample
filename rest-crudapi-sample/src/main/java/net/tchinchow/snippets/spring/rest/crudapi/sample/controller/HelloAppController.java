package net.tchinchow.snippets.spring.rest.crudapi.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.tchinchow.snippets.spring.rest.crudapi.sample.entity.User;
import net.tchinchow.snippets.spring.rest.crudapi.sample.service.UsersService;

import java.util.List;

@Controller
public class HelloAppController {

    @Autowired
    private UsersService usersService;

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    @GetMapping("/")
    public String main(Model model)
    {
        List<User> users = usersService.getUsers();
        model.addAttribute("message", message);
        model.addAttribute("users", users);

        return "welcome"; //view
    }

    // /hello?name=kotlin
    @GetMapping("/app/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "") 
            String name, Model model)
    {

        model.addAttribute("message", name);
        model.addAttribute("users", usersService.getUsers());

        return "welcome"; //view
    }

}