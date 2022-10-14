package com.udaya.inteview.question.service;

import org.springframework.stereotype.Component;

@Component
public interface MinimumCoinsService {
    Integer getMinimumCoins(Integer number);
}
