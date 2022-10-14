package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.PalindromeCheckerService;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PalindromeCheckerControllerTest extends TestCase {

    private MockMvc mockMvc;

    @Mock
    PalindromeCheckerService palindromeCheckerService;

    @InjectMocks
    PalindromeCheckerController palindromeCheckerController;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(palindromeCheckerController).build();
    }

    @Test
    public void validatePalindrome() throws Exception {
        Mockito.when(palindromeCheckerService.validatePalindrome("noon")).thenReturn(true);
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/palindromes/getPalindromeValidateStatus/noon")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        mockMvc.perform(mockHttpServletRequestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
