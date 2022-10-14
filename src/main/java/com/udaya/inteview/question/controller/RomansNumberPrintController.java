package com.udaya.inteview.question.controller;

import com.udaya.inteview.question.service.RomansNumberPrintService;
import com.udaya.inteview.question.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/romans")
@CrossOrigin(origins = "*")
public class RomansNumberPrintController {

    private final RomansNumberPrintService romansNumberPrintService;

    @Autowired
    public RomansNumberPrintController(RomansNumberPrintService romansNumberPrintService) {
        this.romansNumberPrintService = romansNumberPrintService;
    }

    @GetMapping(path = "/getRomansNumerals/{number}")
    public ResponseEntity<ResponseObject> getRomansNumerals(@PathVariable("number") Integer number) {
        return  this.romansNumberPrintService.getRomansNumerals(number);

    }
}
