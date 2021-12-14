package com.company;
import java.util.*;
public class Calculator {
   static int n1,n2;
   static double m;
    public static long powerInt(int num1,int num2)
    {
        n1=num1;
        n2=num2;
        return (long) Math.pow(n1,n2);
    }
    public static double powerDouble(double num1,int num2)
    {
        m=num1;
        n2=num2;
        return(Math.pow(m,n2));

    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first and second number");
       System.out.println(Calculator.powerInt(s.nextInt(),s.nextInt()));
        System.out.println("enter the first number as double and second as int ");
        System.out.println(Calculator.powerDouble(s.nextDouble(),s.nextInt()));

    }
}
