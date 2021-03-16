package DesignPatterns.MVCDesignPattern;

import java.util.ArrayList;

public class StudentDAOService {

    private static ArrayList<Student> sList=new ArrayList<Student>();

    public static String addStudent(int id, String name, int fee) {
        Student s = new Student(id,name,fee);
        sList.add(s);
        return "Student "+name+" added successfully.";
    }

    public static String getAllStudents() {
//        return sList;
        String res="";
        for(Student s:sList) {
            res+=s+"\n";
        }
        return res;
    }

    public static String getAStudent(int id) {
        String res="";
        for(Student s:sList)
        {
            if(s.getId()==id)
            {
                return res+s;
            }
        }
        return "Student Not Found";
    }

    public static Student getAStudent(String name) {

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
