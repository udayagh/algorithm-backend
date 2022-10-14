package com.udaya.inteview.question.serviceImpl;

import com.udaya.inteview.question.service.MinimumCoinsService;
import com.udaya.inteview.question.util.MinCoins;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MinimumCoinsServiceImpl implements MinimumCoinsService {

    private static final Logger logger = LoggerFactory.getLogger(MinimumCoinsServiceImpl.class);

    @Override
    public Integer getMinimumCoins(Integer number) {
        int result = 0;
        try {
            MinCoins obj = new MinCoins();

            int coinsArr1[] = {1, 2, 5, 10, 20, 50, 100};
            int requestNumber = number;
            int size = coinsArr1.length;

            result = obj.minNoCoins(coinsArr1, size, requestNumber);

            logger.info("For the sum:- " + requestNumber);
            logger.info("The minimum number of required coins is:- " + result);
            logger.info("Using the following coins:- ");

            for (int i = 0; i < size; i++) {
                System.out.print(coinsArr1[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
