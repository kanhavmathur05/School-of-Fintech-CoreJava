package DesignPatterns.MVCDesignPattern;

import DesignPatterns.MVCDesignPattern.controller.StudentController;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args)
    {
//        MENU drive program to perform operations on Student. while and switch cases.
    Scanner sc=new Scanner(System.in);

    while(true)
    {
        System.out.println("1. Add Student");
        System.out.println("2. Get all Students");
        System.out.println("3. Get Student by name");
        System.out.println("4. Get Student by id");
        System.out.println("5. Exit");

        int ch=sc.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("Enter ID");
                String id=sc.next();
                System.out.println("Enter Name");
                String name=sc.next();
                System.out.println("Enter Fee");
                String fee=sc.next();
                System.out.println(StudentController.addStudentController(id,name,fee));
                break;

            case 2:
                String res=StudentController.getAllStudentController();
                System.out.println(res);
                break;

            case 3:

//                System.out.println("Enter name of Student:");
//                String studentId=sc.next();
//                System.out.println(StudentController.getAStudentController(studentId));

//                System.out.println("Enter name of Student:");
//                String studentName=sc.next();
//                Student student = sDao.getAStudent(studentName);
//                if(student!=null)
//                {
//                    System.out.println(student);
//                }
//                else
//                {
//                    System.out.println("Student not Found");
//                }


                break;

            case 4:
                System.out.println("Enter ID of Student:");
                String studentId=sc.next();
                System.out.println(StudentController.getAStudentController(studentId));
                break;

            default:
                System.out.println("Bye Bye");
                sc.close();
                System.exit(0);
        }
    }
    }

}
