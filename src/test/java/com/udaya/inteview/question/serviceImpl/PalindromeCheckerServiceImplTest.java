package com.udaya.inteview.question.serviceImpl;

import com.udaya.inteview.question.service.PalindromeCheckerService;
import com.udaya.inteview.question.util.RemoveUnwantedCharacter;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PalindromeCheckerServiceImplTest extends TestCase {

    private MockMvc mockMvc;

    @InjectMocks
    PalindromeCheckerServiceImpl palindromeCheckerServiceImpl;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(palindromeCheckerServiceImpl).build();
    }

    @Test
    public void testValidatePalindrome() {
        boolean validatePalindrome = palindromeCheckerServiceImpl.validatePalindrome("A man, a plan, a canal, Panama!");
        Assert.assertEquals(true, validatePalindrome);
    }

    @Test
    public void invalidValidatePalindrome() {
        boolean validatePalindrome = palindromeCheckerServiceImpl.validatePalindrome("A man, a plan, a canall, Panama!");
        Assert.assertEquals(false, validatePalindrome);
    }
}
