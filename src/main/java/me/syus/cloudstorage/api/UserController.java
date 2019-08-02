package me.syus.cloudstorage.api;


import me.syus.cloudstorage.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
        User user = new User();
        user.setUsername(name);
        return user;
    }

}
