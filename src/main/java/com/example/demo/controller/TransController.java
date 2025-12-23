package com.example.demo.controller;

import com.example.demo.entity.Trans;
import com.example.demo.service.TransService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/trans")
public class TransController {
    @Autowired
    TransService transService;

    @PostMapping
    public Trans saveStudent(@RequestBody Trans trans) {
        return transService.saveTrans(trans);
    }
}