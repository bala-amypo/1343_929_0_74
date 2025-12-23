package com.example.demo.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Trans;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.TransRepo;

@Service
public class TransServiceImple {
    @Autowired
    TransRepo transRepo;

    public Trans saveTrans(Trans trans){
        transRepo.save(trans);
        throw new ResourceNotFoundException("Testing trans");
    }
}
