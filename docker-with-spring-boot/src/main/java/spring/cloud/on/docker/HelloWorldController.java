package spring.cloud.on.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wushibin on 17/9/20.
 */
@RestController
class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
}