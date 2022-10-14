package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.FibonacciSeriesService;
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
public class FibonacciSeriesControllerTest extends TestCase {

    private MockMvc mockMvc;

    @Mock
    FibonacciSeriesService fibonacciSeriesService;

    @InjectMocks
    FibonacciSeriesController fibonacciSeriesController;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(fibonacciSeriesController).build();
    }

    @Test
    public void testGetFibonacciSeries() throws Exception {
        Mockito.when(fibonacciSeriesService.getFibonacciSeries(12)).thenReturn(144);
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/fibonacciSeries/getFibonacciSeries/12")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        mockMvc.perform(mockHttpServletRequestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
