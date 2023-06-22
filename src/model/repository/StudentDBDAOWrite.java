package model.repository;

import model.entity.Student;

public interface StudentDBDAOWrite {
    void save(Student student) throws Exception;

    void delete(String id) throws Exception;

    void edit(Student student) throws Exception;
}
