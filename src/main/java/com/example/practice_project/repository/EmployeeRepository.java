package com.example.practice_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.example.practice_project.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
