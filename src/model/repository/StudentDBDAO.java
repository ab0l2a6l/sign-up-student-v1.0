package model.repository;

import model.entity.Student;

public class StudentDBDAO implements StudentDBDAORead , StudentDBDAOWrite{
    @Override
    public Student findById(String id) throws Exception {
        return null;
    }

    @Override
    public Student findByAll() throws Exception {
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
