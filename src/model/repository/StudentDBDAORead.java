package model.repository;

import model.entity.Student;

import java.util.List;

public interface StudentDBDAORead {
    Student findById(String id) throws Exception;

    List<Student> findByAll() throws Exception;

    void close() throws Exception;
}
