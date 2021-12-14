//Design a java program to display the number of instances created so far of a specific class.

package com.company;

public class Instances {
    public static int count =0;
    Instances()
    {
        count++;
    }

    public static void main(String[] args) {
        Instances obj1=new Instances();
        Instances obj2=new Instances();
        System.out.print("No. of instance are ");
        System.out.println(Instances.count);

    }
}
