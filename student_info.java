// Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two member methods with the same name “setInfo”. First method has two parameters for name and age and assigns the same whereas the second method takes three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.

import java.util.*;

class Student
{
    String name,address;
    int age;

    //non parameterised constructor

    Student()
    {
        name="unknown";
        age=0;
        address="not available";
    }

    public void setinfo(String n,int a)
    {
        name=n;
        age=a;
        System.out.println("Your name is "+name+"\n"+"Your age is "+age+"\n"+"Your address is "+address);
    }
    public void setinfo(String na,int ag,String add)
    {
        name=na;
        age=ag;
        address=add;
        System.out.println("Your name is "+name+"\n"+"Your age is "+age+"\n"+"Your address is "+address);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter name ,age and then address");
        Scanner s=new Scanner(System.in);
        //for first candidate
       Student obj1=new Student();
      obj1.setinfo(s.next(),s.nextInt());

       //for second student
        Student obj2=new Student();
        obj2.setinfo(s.next(),s.nextInt(),s.next());

        //for third student
        Student obj3=new Student();
        obj3.setinfo(s.next(),s.nextInt(),s.next());

        //for fourth  student
        Student obj4=new Student();
        obj4.setinfo(s.next(),s.nextInt(),s.next());

        //for fifth candidate
        Student obj5=new Student();
        obj5.setinfo(s.next(),s.nextInt());

        //for sixth student
        Student obj6=new Student();
        obj6.setinfo(s.next(),s.nextInt());

        //for seventh student
        Student obj7=new Student();
        obj7.setinfo(s.next(),s.nextInt(),s.next());

        //for eighth student
        Student obj8=new Student();
        obj8.setinfo(s.next(),s.nextInt(),s.next());

        //for ninth student
        Student obj9=new Student();
        obj9.setinfo(s.next(),s.nextInt());

        //for tenth student
        Student obj10=new Student();
        obj10.setinfo(s.next(),s.nextInt(),s.next());
    }
}
