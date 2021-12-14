/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero. 

This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .  Use exception handling mechanisms to handle this exception. */



package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Arr {
    public static void main(String []args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of elements in array");
            int a = s.nextInt();
            int[] ar = new int[a];
            System.out.println("Enter the elements");
            for(int i=0;i<ar.length;i++)
                ar[i] = s.nextInt();
            System.out.println("Enter the index of the array element you want to access");
            int b = s.nextInt();
            System.out.println("The array element at index "+b+" is "+ar[b]);
            System.out.println("The array element is successfully accessed.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is "+e);
        }
        catch(InputMismatchException e){
            System.out.println("Exception is"+e);
        }
    }
}
