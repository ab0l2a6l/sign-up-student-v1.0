package controler;

import model.entity.Student;
import model.service.StudentService;
import model.service.StudentServiceRead;
import model.service.StudentServiceWrite;

import java.util.List;

public class StudentControler {
    StudentServiceWrite write = new StudentService();
    StudentServiceRead read = new StudentService();

    public void save(Student student) {
        write.save(student);
    }

    public void delete(String id) {
        write.delete(id);
    }

    public void edit(Student student) {
        write.edit(student);
    }

    public Student findById(String id) {
        return read.findById(id);
    }

    public List<Student> findByAll() {
        return read.findByAll();
    }
}
