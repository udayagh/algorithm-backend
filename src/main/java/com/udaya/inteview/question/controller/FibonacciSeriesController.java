package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.FibonacciSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fibonacciSeries")
@CrossOrigin(value = "*")
public class FibonacciSeriesController {

    private final FibonacciSeriesService fibonacciSeriesService;

    @Autowired
    public FibonacciSeriesController(FibonacciSeriesService fibonacciSeriesService) {
        this.fibonacciSeriesService = fibonacciSeriesService;
    }

    @GetMapping(path = "/getFibonacciSeries/{number}")
    public Integer getFibonacciSeries(@PathVariable("number") Integer number) {
        return this.fibonacciSeriesService.getFibonacciSeries(number);
    }
}
