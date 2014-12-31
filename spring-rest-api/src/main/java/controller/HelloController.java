package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.HelloService;


@RestController
@RequestMapping("hello")
class HelloController {



    @Autowired
    private HelloService helloService;

    /**
     * GET with with path variable
     */
    @RequestMapping(value="/{name}")
    public String hello1(@PathVariable String name) {
        return helloService.sayHello(name);
    }

    /**
     * POST
     */
    @RequestMapping(value="/{name}", method=RequestMethod.POST)
    public String hello2(@PathVariable String name) {
        return helloService.sayHello(name);
    }

    /**
     * GET with parameters
     */
    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public String hello3(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return helloService.sayHello(name);
    }
}