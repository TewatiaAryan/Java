//Create an outer class with a function display, again create another class inside the outer class named inner with a function called display and call the two functions in the main class. 

package com.company;

public class Outer {
    void display()
    {
        System.out.println("Inside outer class");
    }
    class inner
    {
        void display()
        {
            System.out.println("Inside inner class");
        }
    }

    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.display();

        Outer.inner obj1=obj.new inner();
        obj1.display();

    }
}
