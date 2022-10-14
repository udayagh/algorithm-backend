package com.udaya.inteview.question.service;

import org.springframework.stereotype.Component;

@Component
public interface PalindromeCheckerService {

    boolean validatePalindrome(String palindrome);
}
