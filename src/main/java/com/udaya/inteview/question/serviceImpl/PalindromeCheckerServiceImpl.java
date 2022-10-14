package com.udaya.inteview.question.serviceImpl;

import com.udaya.inteview.question.service.PalindromeCheckerService;
import com.udaya.inteview.question.util.RemoveUnwantedCharacter;
import com.udaya.inteview.question.util.RevisedCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PalindromeCheckerServiceImpl implements PalindromeCheckerService {

    private static final Logger logger = LoggerFactory.getLogger(PalindromeCheckerServiceImpl.class);

    @Override
    public boolean validatePalindrome(String palindrome) {
        boolean validateStatus = false;
        try {
            String originalValue = RemoveUnwantedCharacter.removeUnwantedCharacter(palindrome).toLowerCase().trim();
            logger.info("Inside main method-original value:- " + originalValue);

            String revisedName = RevisedCharacter.getRevisedCharacter(originalValue);
            logger.info("Inside main method-revised value:- " + revisedName);

            validateStatus = validateStatus(originalValue, revisedName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return validateStatus;
    }

    /**
     * @param originalValue
     * @param revisedName
     * @return
     */
    private static boolean validateStatus(String originalValue, String revisedName) {
        boolean finalStatus = false;
        if (originalValue.equals(revisedName)) {
            return true;
        }
        return finalStatus;
    }
}
