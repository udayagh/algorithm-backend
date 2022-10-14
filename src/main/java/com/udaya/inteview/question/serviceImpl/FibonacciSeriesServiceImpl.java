package com.udaya.inteview.question.serviceImpl;

import com.udaya.inteview.question.service.FibonacciSeriesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FibonacciSeriesServiceImpl implements FibonacciSeriesService {

    private static final Logger logger = LoggerFactory.getLogger(FibonacciSeriesServiceImpl.class);

    @Override
    public Integer getFibonacciSeries(Integer number) {
        int f[] = new int[0];
        try {
            f = new int[number + 2];
            int i;
            f[0] = 0;
            f[1] = 1;

            System.out.println(f[0]);
            System.out.println(f[1]);
            int sum = 0;
            for (i = 2; i <= number; i++) {
                f[i] = f[i - 1] + f[i - 2];
                System.out.println(f[i]);
                sum = sum + f[i];
            }
            logger.info("Sum:- " + sum);
        } catch (Exception e) {
            logger.info("Sum:- " + e.getMessage());
        }

        return f[number];
    }
}
