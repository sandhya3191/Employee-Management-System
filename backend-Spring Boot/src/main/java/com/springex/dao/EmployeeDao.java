package com.springex.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springex.entity.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
