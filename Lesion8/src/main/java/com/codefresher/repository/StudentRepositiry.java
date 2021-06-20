package com.codefresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefresher.model.Student;

@Repository
public interface StudentRepositiry extends JpaRepository<Student, Integer>{

}
