package com.codefresher.service;

import java.util.List;

import com.codefresher.model.Student;

public interface StudentService {
    // get all student
    java.util.List<Student> getAllStudent();

    //add student
    Student insertStudent(Student student);
}
