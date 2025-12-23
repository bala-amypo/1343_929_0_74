package com.example.demo.service;

import com.example.demo.entity.Trans;
import java.util.List;

public interface TransService {

    Trans saveStudent(Trans trans);
    List<Trans> getStudentById();
}