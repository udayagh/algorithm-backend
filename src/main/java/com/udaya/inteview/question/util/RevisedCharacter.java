package com.udaya.inteview.question.util;

public class RevisedCharacter {

    /**
     *
     * @param originalName
     * @return
     */
    public static String getRevisedCharacter(String originalName){
        StringBuilder stringBuilder = new StringBuilder(originalName.toLowerCase().trim());
        return stringBuilder.reverse().toString();
    }
}
