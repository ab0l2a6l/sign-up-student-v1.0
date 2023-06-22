package model.service;

import model.entity.Student;

public interface StudentServiceWrite {
    void save(Student student) throws Exception;

    void delete(String id) throws Exception;

    void edit(Student student) throws Exception;
}
