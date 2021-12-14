// write a Java program to find if the given number is palindrome or not


package com.company;
import java.util.Scanner;
public class Palindrone {
    int arr[];
   int x=0;

   void pal(int arr[])
   {
       for(int i=0;i<arr.length;i++) {
           if (arr[i] != arr[arr.length - i - 1]) {
               x += 1;
           }
       }
           if(x>0)
           {
               System.out.println("Not palindrone");
           }
           else
           {
               System.out.println("Palindrone");
           }
       }

    public static void main(String[] args) {
        int length=0;
        System.out.println("Enter the length of the number");
        Scanner s=new Scanner(System.in);
        length=s.nextInt();
        int a[]=new int [length];
        System.out.println("Enter the  number");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        Palindrone obj=new Palindrone();
        obj.pal(a);


    }
}
