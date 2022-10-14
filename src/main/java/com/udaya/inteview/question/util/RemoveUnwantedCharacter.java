package com.udaya.inteview.question.util;

public class RemoveUnwantedCharacter {

    /**
     *
     * @param originalValue originalValue
     * @return
     */
    public static String removeUnwantedCharacter(String originalValue){
        return originalValue.replaceAll("[^a-zA-Z0-9]", "");
    }
}
