package DesignPatterns.DAOPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args)
    {
//        MENU drive program to perform operations on Student. while and switch cases.
    Scanner sc=new Scanner(System.in);

    StudentDaoImpl sDao=new StudentDaoImpl();
        ArrayList<Student> studentList=sDao.getAllStudents();
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
                int id=sc.nextInt();
                System.out.println("Enter Name");
                String name=sc.next();
                System.out.println("Enter Fee");
                int fee=sc.nextInt();
                System.out.println(sDao.addStudent(id,name,fee));
                break;

            case 2:

                for(Student s:studentList)
                {
                    System.out.println("ID:"+s.getId());
                    System.out.println("Name:"+s.getName());
                    System.out.println("Fee:"+s.getFee());
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Enter name of Student:");
                String studentName=sc.next();
                Student student = sDao.getAStudent(studentName);
                if(student!=null)
                {
                    System.out.println(student);
                }
                else
                {
                    System.out.println("Student not Found");
                }

                //                System.out.println("ID:"+student.getId());
//                System.out.println("Name:"+student.getName());
//                System.out.println("Fee:"+student.getFee());
//                System.out.println();
                break;

            case 4:
                System.out.println("Enter name of Student:");
                int studentId=sc.nextInt();
                Student studentById = sDao.getAStudent(studentId);
                if(studentById!=null)
                {
                    System.out.println(studentById);
                }
                else
                {
                    System.out.println("Student not Found");
                }
                break;

            default:
                System.out.println("Bye Bye");
                System.exit(0);
        }
    }
    }

}
