/* Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..] */

package com.company;
import java.util.*;

public abstract class Compartment
{
    public abstract String  notice();

}

class FirstClass extends Compartment
{
    String s="This is First class Compartment";
    public String notice()
    {
        return s;
    }
}

class Ladies extends Compartment
{
    String s2="This is Ladies Compartment";
    public String notice()
    {
        return s2;
    }
}

class General extends Compartment
{
    String s3="This is General Compartment";
    public String notice()
    {
        return s3;
    }
}

class Luggage extends Compartment
{
    String s4="This is Luggage Compartment";
    public String notice()
    {
        return s4;
    }
}

class Test145 {
    public static void main(String[] args) {
        Compartment arr[] = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int randomnum = r.nextInt((3 - 1) + 1) + 1;
            if (randomnum == 1) {
                arr[i] = new FirstClass();
                System.out.println(arr[i].notice());
            } else if (randomnum == 2) {
                arr[i] = new Ladies();
                System.out.println(arr[i].notice());
            } else if (randomnum == 3) {
                arr[i] = new General();
                System.out.println(arr[i].notice());
            } else if (randomnum == 4) {
                arr[i] = new Luggage();
                System.out.println(arr[i].notice());
            } else {
                System.out.println();
            }
        }
    }
}
