package model.service;

import model.entity.Student;

import java.util.List;

public interface StudentServiceRead {
    Student findById(String id);

    List<Student> findByAll();
}

