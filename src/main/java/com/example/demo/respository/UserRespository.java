package com.example.demo.respository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CUser;

public interface UserRespository extends JpaRepository<CUser, Integer> {
    CUser findByUsername(String username);

    
}
