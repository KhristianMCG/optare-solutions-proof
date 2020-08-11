package com.optare.proof.controller;

import com.optare.proof.service.ConcatenateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatenationController {

    private final ConcatenateService concatenateService;

    @Autowired
    public ConcatenationController(ConcatenateService concatenateService) {
        this.concatenateService = concatenateService;
    }

    @GetMapping(path = "/concatenate/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String concatenateName(@PathVariable String name) {
        return this.concatenateService.concatenateName(name);
    }
}
