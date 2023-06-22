package model.service;

import model.entity.Student;
import model.repository.StudentDBDAO;
import model.repository.StudentDBDAORead;
import model.repository.StudentDBDAOWrite;

import java.util.List;

public class StudentService implements StudentServiceRead, StudentServiceWrite {

    StudentDBDAOWrite write;
    StudentDBDAORead read;

    @Override
    public Student findById(String id) {
        Student byId = null;
        try {
            read = new StudentDBDAO();
            byId = read.findById(id);
            read.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return byId;
    }

    @Override
    public List<Student> findByAll() {
        List<Student> byAll = null;
        try {
            read = new StudentDBDAO();
            byAll = read.findByAll();
            read.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return byAll;
    }

    @Override
    public void save(Student student) {
        try {
            write = new StudentDBDAO();
            write.save(student);
            write.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        try {
            write = new StudentDBDAO();
            write.delete(id);
            write.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void edit(Student student) {
        try {
            write = new StudentDBDAO();
            write.edit(student);
            write.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
