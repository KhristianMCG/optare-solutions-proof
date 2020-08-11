package com.optare.proof.service;

import org.springframework.stereotype.Service;

@Service
public class ConcatenateService {

    public String concatenateName(String name) {
        return "Hello! ".concat(name);
    }
}
