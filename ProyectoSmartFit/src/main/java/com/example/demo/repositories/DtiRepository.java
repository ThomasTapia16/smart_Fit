package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.DTI;

@Repository
public interface DtiRepository extends JpaRepository<DTI,String>{

}
