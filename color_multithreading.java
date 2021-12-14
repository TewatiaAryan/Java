/*
store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface
*/

package com.company;
import java.util.Random;

class MyThread3 implements Runnable
{
    String str[]={"white", "blue", "black", "green", "red", "yellow"};
    Random r=new Random();
    int n;
    public void run() {
        for(int i=0;i<6;i++)
        {
            n=r.nextInt((5)+1);
            if(str[n].equalsIgnoreCase("red"))
            {
                System.out.println(str[n]);
                break;
            }
            else
            {
                System.out.println(str[n]);
            }
        }
    }
}

public class Multi2
{
    public static void main(String[] args) {
        MyThread3 obj3=new MyThread3();
        Thread t=new Thread(obj3);
        t.start();
    }
}
