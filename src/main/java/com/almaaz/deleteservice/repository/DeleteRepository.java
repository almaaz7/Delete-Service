package com.almaaz.deleteservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.almaaz.deleteservice.model.Employee;

public interface DeleteRepository extends CrudRepository<Employee, Integer>{

}
