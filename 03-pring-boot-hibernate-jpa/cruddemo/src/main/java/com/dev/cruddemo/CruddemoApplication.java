package com.dev.cruddemo;

import com.dev.cruddemo.dao.StudentDAO;
import com.dev.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            System.out.println("Hello world!");

            //createStudent(studentDAO);
            //createMultipleStudents(studentDAO);
            //readStudent(studentDAO);
            //queryStudents(studentDAO);
            //updateStudent(studentDAO);
            //deleteStudent(studentDAO);
            //deleteAllStudents(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating a new student object...");
        Student tempStudent = new Student("Paul", "Doe", "paul@gmail.com");

        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        System.out.println("Saved student. Generated id: " + tempStudent.getId());
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating a new student object...");
        /*Student tempStudent1 = new Student("John", "Doe", "john@gmail.com");
        Student tempStudent2 = new Student("Mary", "Public", "mary@gmail.com");
        Student tempStudent3 = new Student("Bonita", "Apple", "bonita@gmail.com");*/

        List<Student> students = List.of(new Student("John", "Doe", "john@gmail.com"),
                new Student("Mary", "Public", "mary@gmail.com"), new Student("Bonita", "Apple", "bonita@gmail.com"));

        System.out.println("Saving the student...");
        students.forEach(studentDAO::save);
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Retrieving student with id: " + 1);
        Student student = studentDAO.findById(1);
        System.out.println("Found the student: " + student);
    }

    private void queryStudents(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();
        students.forEach(System.out::println);
        System.out.println();
        students = studentDAO.findByLastName("Doe");
        students.forEach(System.out::println);
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("Getting student with id: " + studentId);
        Student myStudent = studentDAO.findById(studentId);

        System.out.println("Updating student...");
        myStudent.setFirstName("Adrian");
        studentDAO.update(myStudent);

        System.out.println("Updated student: " + myStudent);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 3;
        System.out.println("Deleting student id: " + studentId);
        studentDAO.delete(studentId);
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleting all the students...");
        int students = studentDAO.deleteAll();
        System.out.println("Deleted row count: " + students);
    }

}
