package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;


@RestController
@RequestMapping("hello")
class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/{name}")
    String hello(@PathVariable String name) {
        return helloService.sayHello(name);
    }
}