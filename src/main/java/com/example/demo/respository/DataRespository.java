package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserData;

public interface DataRespository extends JpaRepository<UserData, Integer>{
    UserData findById(int id);

}
