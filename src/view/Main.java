package view;

import common.StaticScanner;
import controler.StudentControler;
import model.entity.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();
        StudentControler studentControler = new StudentControler();

        for (; ; ) {
            menu();
            int requestFromUserForSwitch = input.nextInt();
            input.nextLine();

            switch (requestFromUserForSwitch) {
                case 1 -> {
                    Student student = new Student();
                    student.setfName(input.nextLine());
                    student.setlName(input.nextLine());
                    student.setEmail(input.nextLine());
                    student.setAge(input.nextInt());
                    input.nextLine();
                    student.setId(input.nextLine());

                    studentControler.save(student);
                }

                case 2 -> {
                    studentControler.delete(input.nextLine());
                }

                case 3 -> {
                    Student student = new Student();

                    System.out.println("insert id for update: ");
                    student.setId(input.nextLine());

                    student.setfName(input.nextLine());
                    student.setlName(input.nextLine());
                    student.setEmail(input.nextLine());
                    student.setAge(input.nextInt());
                    input.nextLine();

                    studentControler.edit(student);

                }

                case 4 -> {
                    Student student;
                    student = studentControler.findById(input.nextLine());
                    if (student != null) {
                        System.out.println(student.getfName() + student.getlName() + student.getEmail()
                                + student.getAge() + student.getId());
                    }
                }

                case 5 -> {
                    List<Student> studentList;
                    studentList = studentControler.findByAll();
                    studentList.forEach(System.out::println);
                }

                case 6 -> {
                    return;
                }
                default -> System.out.println("wrong number !!!");
            }

        }
    }

    private static void menu() {
        System.out.println("1.insert");
        System.out.println("2.delete");
        System.out.println("3.update");
        System.out.println("4.search by id");
        System.out.println("5.show all");
        System.out.println("6.exit");
    }
}
