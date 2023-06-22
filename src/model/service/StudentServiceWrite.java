package model.service;

import model.entity.Student;

public interface StudentServiceWrite {
    void save(Student student);

    void delete(String id);

    void edit(Student student);
}
