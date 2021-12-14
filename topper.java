// Design an application in java that contains a class Student having properties name and percentage. Create a class Test that declares three instances of Student class. The values are passed through constructor at the time of its object creation. The output should be the name and percentage of the topper.
 
import java.util.Scanner;

class Student {
    String name;
    float percentage;

    Student(String name, float percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public static void main(String[] args) {
        System.out.println("enter the name and percentage");
        Scanner s = new Scanner(System.in);
        String s1,s2,s3;
        float p1,p2,p3;
        s1=s.nextLine();
        p1=s.nextFloat();
        Student obj1 = new Student(s1,p1);
        System.out.println("enter the name and percentage");
        s2=s.next();
        p2=s.nextFloat();
        Student obj2 = new Student(s2,p2);
        System.out.println("enter the name and percentage");
        s3=s.next();
        p3=s.nextFloat();
        Student obj3 = new Student(s3,p3);

        if(obj1.percentage>obj2.percentage &&obj1.percentage>obj3.percentage)
        {
            System.out.println(obj1.name);
            System.out.println(obj1.percentage);
        }
        else if(obj2.percentage>obj1.percentage &&obj2.percentage>obj3.percentage)
        {
            System.out.println(obj2.name);
            System.out.println(obj2.percentage);
        }
        else
        {
            System.out.println(obj3.name);
            System.out.println(obj3.percentage);
        }
            }
        }
