package net.tchinchow.snippets.spring.rest.crudapi.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.tchinchow.snippets.spring.rest.crudapi.sample.service.HelloWorldService;;

/**
 * @author JavaSolutionsGuide
 *
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/api/helloworld")
    public String getHelloWorld() {
        return helloWorldService.getHelloWorld(null);
    }

    @GetMapping("/api/helloworld/{name}")
    public String getEmployee(@PathVariable(name = "name") String name) {
        return helloWorldService.getHelloWorld(name);
    }

}