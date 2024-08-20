package io.github.evandrofranca.poc_auth0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {

    @GetMapping("/public")
    public Object userPublic() {
        return "Endpoint user public";
    }

    @GetMapping("/private")
    public Object userPrivate() {
        return "Endpoint user private";
    }

}
