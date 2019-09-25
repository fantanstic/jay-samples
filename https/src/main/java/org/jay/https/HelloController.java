package org.jay.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiajie
 * @date 2019-09-25 14:43
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello world!";
    }
}
