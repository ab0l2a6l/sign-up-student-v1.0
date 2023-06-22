package model.service;

import model.entity.Student;

import java.util.List;

public class StudentService implements StudentServiceRead ,StudentServiceWrite{

    @Override
    public Student findById(String id) {
        return null;
    }

    @Override
    public List<Student> findByAll() {
        return null;
    }

    @Override
    public void save(Student student) throws Exception {

    }

    @Override
    public void delete(String id) throws Exception {

    }

    @Override
    public void edit(Student student) throws Exception {

    }
}
