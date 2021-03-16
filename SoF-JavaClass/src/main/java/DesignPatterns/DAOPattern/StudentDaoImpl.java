package DesignPatterns.DAOPattern;

import java.util.ArrayList;

public class StudentDaoImpl implements StudentDAO {

    private ArrayList<Student> sList=new ArrayList<Student>();

    public String addStudent(int id, String name, int fee) {
        Student s = new Student(id,name,fee);
        sList.add(s);
        return "Student "+name+" added successfully.";
    }

    public ArrayList<Student> getAllStudents() {
        return sList;
    }

    public Student getAStudent(int id) {
        for(Student s:sList)
        {
            if(s.getId()==id)
            {
                return s;
            }
        }
        return null;
    }

    public Student getAStudent(String name) {

        for(Student s:sList)
        {
            if(s.getName().equalsIgnoreCase(name))
            {
                return s;
            }
        }
        return null;
    }
}
