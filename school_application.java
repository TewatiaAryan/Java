//A HighSchool application has two classes: the Person superclass and the Student subclass. Using inheritance, you will create two new classes, Teacher and CollegeStudent. A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). The CollegeStudent class will extend the Student class by adding a year (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”)

package com.company;
import java.util.*;
public class Person {
    String name;
    Person(String name)
    {
        this.name=name;
        System.out.println("Your name is "+name);
    }
}

class Student extends Person
{
    Student(String name) {
        super(name);
    }
}

class Teacher extends Person
{
    String subject;
    int salary;
    Teacher(String name,String subject,int salary)
    {
        super(name);
        this.subject=subject;
        this.salary=salary;
        System.out.println("Your subject is "+subject);
        System.out.println("Your salary is "+salary);
    }
}

class CollegeStudent extends Student
{
   int year;
   String major;
    CollegeStudent(String name,int year,String major)
    {
        super(name);
        this.year=year;
        this.major=major;
        System.out.println("Your year is "+year);
        System.out.println("Your major is "+major);
    }
}

class Driver45
{
    public static void main(String[] args) {
         String choice;
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter whether you are a teacher or student (t /s)");
        choice=sc.nextLine();
        if(choice.equals("t"))
        {
            System.out.println("Enter your name,subject and salry");
            Teacher obj1=new Teacher(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        if(choice.equals("s"))
        {
            System.out.println("Enter your name,year and major");
            CollegeStudent obj2=new CollegeStudent(sc.nextLine(),sc.nextInt(),sc.nextLine());
        }
    }
}
