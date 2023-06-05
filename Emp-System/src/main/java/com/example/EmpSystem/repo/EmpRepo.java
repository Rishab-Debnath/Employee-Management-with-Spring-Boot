package com.example.EmpSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpSystem.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>  {

}
