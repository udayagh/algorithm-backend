package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.MinimumCoinsService;
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
public class MinimumCoinsControllerTest extends TestCase {

    private MockMvc mockMvc;

    @Mock
    MinimumCoinsService minimumCoinsService;

    @InjectMocks
    MinimumCoinsController minimumCoinsController;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(minimumCoinsController).build();
    }

    @Test
    public void testValidatePalindrome() throws Exception {
        Mockito.when(minimumCoinsService.getMinimumCoins(14)).thenReturn(3);
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/minimumCoins/getMinimumConins/14")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        mockMvc.perform(mockHttpServletRequestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
