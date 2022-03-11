package h2.console.h2console_junittest_mock.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController extends BaseControler {


    @GetMapping("newLogin")
    public String login() throws Exception {
        return "new Login";
    }
}
