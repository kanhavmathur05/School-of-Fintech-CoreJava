package DesignPatterns.MVCDesignPattern.controller;

import DesignPatterns.MVCDesignPattern.StudentDAOService;

public class StudentController {

    public static String addStudentController(String sid,String name, String sfee)
    {
        int id=Integer.parseInt(sid);
        int fee=Integer.parseInt(sfee);

        return StudentDAOService.addStudent(id,name,fee);
    }
    public static String getAllStudentController() {
//        ArrayList<Student> slist=new ArrayList<Student>();
        return StudentDAOService.getAllStudents();
    }

    public static String getAStudentController(String id)
    {
        String res="";
        int studentId=Integer.parseInt(id);
        return res+StudentDAOService.getAStudent(studentId);
//        return Stude
//        return null;
    }
}
