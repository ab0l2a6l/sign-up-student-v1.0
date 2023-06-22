package model.repository;

import model.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.List;

public class StudentDBDAO implements StudentDBDAORead, StudentDBDAOWrite {

    private String url = "jdbc:mysql://localhost:3306/firstdb";
    private String username = "root";
    private String password = "Am311865186";

    private String query;

    private Connection connection;
    private Statement statement;

    public StudentDBDAO() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            System.out.println("connected : " + connection);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            connection.close();
            statement.close();
            System.out.println("disconnected");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public Student findById(String id) throws Exception {
        query = "select * from student where student_id = " + id;
        ResultSet set = statement.executeQuery(query);
        if (set.next()) {
            Student student = new Student();
            student.setfName(set.getString("student_first_name"));
            student.setlName(set.getString("student_last_name"));
            student.setAge(set.getInt("student_age"));
            student.setEmail(set.getString("student_email"));
            student.setId(set.getString("student_id"));

            return student;
        }
        return null;
    }

    @Override
    public List<Student> findByAll() throws Exception {
        List<Student> studentList = null;
        query = "select * from  student";
        ResultSet set = statement.executeQuery(query);
        while (set.next()) {
            Student student = new Student();

            student.setfName(set.getString("student_first_name"));
            student.setlName(set.getString("student_last_name"));
            student.setAge(set.getInt("student_age"));
            student.setEmail(set.getString("student_email"));
            student.setId(set.getString("student_id"));

            studentList.add(student);
        }

        return studentList;
    }

    @Override
    public void save(Student student) throws Exception {
        query = "insert into student (student_first_name ,student_last_name " +
                ",student_email , student_age , student_id ) " +
                "values (\"" + student.getfName() + "\",\"" + student.getlName() + "\",\"" + student.getEmail() + "\"" +
                "," + student.getAge() + "," + student.getId() + ")";
        System.out.println(query);
        statement.executeUpdate(query);
    }

    @Override
    public void delete(String id) throws Exception {
        query = "delete from student where student_id = " + id;
        System.out.println(query);
        statement.executeUpdate(query);
    }

    @Override
    public void edit(Student student) throws Exception {
        query = "update student set " +
                "student_first_name\"" + student.getfName() + "\"" +
                "student_last_name\"" + student.getlName() + "\"" +
                "student_email \"" + student.getEmail() + "\"" +
                "student_age " + student.getAge() +
                "where student_id = \"" + student.getId() + "\"";
        statement.executeUpdate(query);
    }
}
