package com.udaya.inteview.question.service;

import com.udaya.inteview.question.util.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface RomansNumberPrintService {

    ResponseEntity<ResponseObject> getRomansNumerals(Integer number);
}
