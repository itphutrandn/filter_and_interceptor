package h2.console.h2console_junittest_mock.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trainer")
public class TrainerController {

    @GetMapping("list")
    public String getList() {
        return "Trainer List";
    }
}
