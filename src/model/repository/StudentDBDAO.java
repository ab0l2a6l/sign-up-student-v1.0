package model.repository;

import model.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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

    public  void close() {
        try {
            connection.close();
            statement.close();
            System.out.println("disconnected");

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


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
