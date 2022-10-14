package com.udaya.inteview.question.serviceImpl;

import com.udaya.inteview.question.service.RomansNumberPrintService;
import com.udaya.inteview.question.util.ResponseObject;
import com.udaya.inteview.question.util.RoamingNumber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RomansNumberPrintServiceImpl implements RomansNumberPrintService {

    @Override
    public ResponseEntity<ResponseObject> getRomansNumerals(Integer number) {
        RoamingNumber roamingNumber = new RoamingNumber();
        return new ResponseEntity<>(new ResponseObject(true, roamingNumber.toRoman(number)), HttpStatus.OK);
    }
}
