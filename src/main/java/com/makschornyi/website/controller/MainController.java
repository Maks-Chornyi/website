package com.makschornyi.website.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping
    public String getIndex() {
        return "index";
    }

    @GetMapping("/index.html")
    public String toIndex() {
        return "index";
    }
}
