package net.tchinchow.snippets.spring.rest.crudapi.sample.service.impl;

import org.springframework.stereotype.Service;

import net.tchinchow.snippets.spring.rest.crudapi.sample.service.HelloWorldService;

/**
 * @author JavaSolutionsGuide
 *
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String getHelloWorld(final String name) {
        return name == null ? "Hello World" : "Hello " + name;
    }

}