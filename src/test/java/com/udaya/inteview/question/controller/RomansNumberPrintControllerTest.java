package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.PalindromeCheckerService;
import com.udaya.inteview.question.service.RomansNumberPrintService;
import com.udaya.inteview.question.util.ResponseObject;
import com.udaya.inteview.question.util.RoamingNumber;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class RomansNumberPrintControllerTest extends TestCase {

    private MockMvc mockMvc;

    @Mock
    RomansNumberPrintService romansNumberPrintService;

    @InjectMocks
    RomansNumberPrintController romansNumberPrintController;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(romansNumberPrintController).build();
    }

    @Test
    public void testGetRomansNumerals() throws Exception {
        ResponseObject responseObject = new ResponseObject(true,"X");
        ResponseEntity<ResponseObject> responseObjectResponseEntity = new ResponseEntity<>(responseObject,HttpStatus.OK);
        Mockito.when(romansNumberPrintService.getRomansNumerals(10)).thenReturn(responseObjectResponseEntity);
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/romans/getRomansNumerals/10")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        mockMvc.perform(mockHttpServletRequestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
