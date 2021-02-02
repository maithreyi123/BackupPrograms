package com.example.RegisterDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.RegisterDemo.domain.Register;

@Repository
public interface RegisterRepository extends CrudRepository<Register, Integer> {

}
