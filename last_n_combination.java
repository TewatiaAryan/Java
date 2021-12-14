//Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive. For example, if the inputs are “Niraj” and 3, then the output should be “rajrajraj.

package com.company;
import java.util.*;
public class Last_n_Repeitions {
    String s1;
    int chars;
    Last_n_Repeitions(String s1,int chars)
    {
        this.s1=s1;
        this.chars=chars;
    }
    public void Last_n()
    {
        for(int i=0;i<chars;i++)
        {
            String s2=s1.substring(s1.length()-chars);
            System.out.print(s2);
        }
    }

    public static void main(String[] args) {
        String str;
        int repeat;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        str=s.nextLine();
        System.out.println("Enter the no of last characters you want to print");
        repeat=s.nextInt();
        Last_n_Repeitions obj=new Last_n_Repeitions(str,repeat);
        obj.Last_n();
    }
}
