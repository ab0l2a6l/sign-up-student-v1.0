package model.repository;

import model.entity.Student;

public interface StudentDBDAORead {
    Student findById(String id) throws Exception;

    Student findByAll() throws Exception;
}
