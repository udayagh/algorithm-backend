package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.MinimumCoinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/minimumCoins")
@CrossOrigin(value = "*")
public class MinimumCoinsController {

    private final MinimumCoinsService minimumCoinsService;

    @Autowired
    public MinimumCoinsController(MinimumCoinsService minimumCoinsService) {
        this.minimumCoinsService = minimumCoinsService;
    }

    @GetMapping(path = "/getMinimumConins/{number}")
    public Integer validatePalindrome(@PathVariable("number") Integer number) {
        return this.minimumCoinsService.getMinimumCoins(number);
    }
}
