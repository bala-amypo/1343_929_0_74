package com.example.demo.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Trans;
import com.example.demo.repository.TransRepo;
import com.example.demo.service.TransService;
import com.example.demo.exception.ResourceNotFoundException;

@Service
public class StudentServiceImple implements StudentService {
    @Autowired
    TransRepo transRepo;

    public Trans saveTrans(Trans student){
        return studentRepository.save(student);
    }
    
    public Student getStudentById(Long id){
        return studentRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("Student not found"));
    }
    public Student updatedata(Long id,Student student){
        Student exits=getStudentById(id);
        exits.setName(student.getName());
        exits.setEmail(student.getEmail());
        return studentRepository.save(exits);
        // .orElseThrow(()-> new ResourceNotFoundException("Student not found"));
    }

    public Student deletdata(Long id){
        Student student=getStudentById(id);
        studentRepository.delete(student);
        return student;
    }

}
