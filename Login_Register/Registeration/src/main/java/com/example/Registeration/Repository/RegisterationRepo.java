package com.example.Registeration.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Registeration.domain.Register;

@Repository
public interface RegisterationRepo extends CrudRepository<Register, String>{

}
