package DesignPatterns.MVCDesignPattern;

import DesignPatterns.DAOPattern.Student;

import java.util.ArrayList;

public interface StudentDAO {
    String addStudent(int id, String name, int fee);
    ArrayList<Student> getAllStudents();
    Student getAStudent(int id);
    Student getAStudent(String name);
}
