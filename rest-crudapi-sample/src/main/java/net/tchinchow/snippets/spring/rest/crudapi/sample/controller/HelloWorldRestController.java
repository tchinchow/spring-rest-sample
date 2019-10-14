package net.tchinchow.snippets.spring.rest.crudapi.sample.controller;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.tchinchow.snippets.spring.rest.crudapi.sample.entity.User;
import net.tchinchow.snippets.spring.rest.crudapi.sample.service.HelloWorldService;
import net.tchinchow.snippets.spring.rest.crudapi.sample.service.UsersService;;

/**
 * @author JavaSolutionsGuide
 *
 */
@RestController
public class HelloWorldRestController {
    Logger logger = LoggerFactory.getLogger(HelloWorldRestController.class);

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private UsersService usersService;

    @GetMapping("/api/helloworld")
    public String getHelloWorld() {
        return helloWorldService.getHelloWorld(null);
    }

    @GetMapping("/api/helloworld/{userId}")
    public String getHelloWorld(@PathVariable(name = "userId") Long userId) {
        try {
            User user = usersService.getUser(userId);
            return helloWorldService.getHelloWorld(user.getName());
        } catch (final NoSuchElementException nsee) {
            logger.error("userId not found", nsee);
            return helloWorldService.getHelloWorld(null);
        }
    }

}