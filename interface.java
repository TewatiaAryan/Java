//Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use the object of arithmetic class. 

package com.company;
import java.util.*;
public interface Test {
    public abstract void square(int n);
}

 class Arithmetic implements Test {
    public void square(int n) {
        System.out.println("Square of the number is");
        System.out.println(n*n);
    }

}

class ToTestInt
{
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Enter the no ");
        Arithmetic obj=new Arithmetic();
        obj.square(s.nextInt());
    }
}
