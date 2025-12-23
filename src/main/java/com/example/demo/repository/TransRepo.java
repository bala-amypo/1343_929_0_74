package com.example.demo.repository;

import com.example.demo.entity.Trans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransRepo extends JpaRepository<Trans, Long> {
    
}
