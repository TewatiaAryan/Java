 //Write a program to print the sum of the elements of an array following the given below condition.

//If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.





package com.company;
import java.util.Scanner;
public class Sum {
    int [] arr;
    int r=0,k=0,s=0,s1=0;

    Sum(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==6)
            {
                r=i;
            }
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==7)
                {
                    k=j;
                }
            }
            s+=arr[i];
        }
        for(int i=r;i<k+1;i++)
        {
            s1+=arr[i];
        }
        System.out.print("Sum is");
        System.out.println(s-s1);
    }
}

class SumMain
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=0;
        System.out.println("Enter the length of the array");
        l=s.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        Sum obj=new Sum(a);
    }
}
