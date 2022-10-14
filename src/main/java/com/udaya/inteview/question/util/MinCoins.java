package com.udaya.inteview.question.util;

public class MinCoins {
    public int minNoCoins(int coinsArr[], int size, int requestNumber) {
        int result = 0;
        try {
            if (requestNumber == 0) {
                return 0;
            }
            result = Integer.MAX_VALUE;
            for (int j = 0; j < size; j++) {
                if (coinsArr[j] <= requestNumber) {
                    int subRes = minNoCoins(coinsArr, size, requestNumber - coinsArr[j]);
                    if (subRes != Integer.MAX_VALUE && subRes + 1 < result) {
                        result = subRes + 1;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
