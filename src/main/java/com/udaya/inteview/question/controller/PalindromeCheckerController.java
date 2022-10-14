package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.PalindromeCheckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/palindromes")
@CrossOrigin(value = "*")
public class PalindromeCheckerController {

    private final PalindromeCheckerService palindromeCheckerService;

    @Autowired
    public PalindromeCheckerController(PalindromeCheckerService palindromeCheckerService) {
        this.palindromeCheckerService = palindromeCheckerService;
    }

    @GetMapping(path = "/getPalindromeValidateStatus/{palindrome}")
    public boolean validatePalindrome(@PathVariable("palindrome") String palindrome) {
        return this.palindromeCheckerService.validatePalindrome(palindrome);
    }
}
