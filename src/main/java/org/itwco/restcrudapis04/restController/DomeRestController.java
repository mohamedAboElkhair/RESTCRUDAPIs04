package org.itwco.restcrudapis04.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DomeRestController {

    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }

}
