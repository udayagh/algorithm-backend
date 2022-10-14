package com.udaya.inteview.question.service;

import org.springframework.stereotype.Component;

@Component
public interface FibonacciSeriesService {
    Integer getFibonacciSeries(Integer number);
}
