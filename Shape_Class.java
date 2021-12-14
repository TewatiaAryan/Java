/* Write a program to create a class named shape. It should contain 2 methods- draw() and erase() which should print “Drawing Shape” and “Erasing Shape” respectively.
For this class we have three sub classes- Circle, Triangle and Square and each class override the parent class functions- draw () and erase (). 
The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing Square” respectively.
The erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing Square” respectively.
Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square(); */


package com.company;

public class Shape {
    String shape="Shape";
    public   void draw()
    {
        System.out.println("Drawing "+shape);
    }
    public  void erase()
    {
        System.out.println("Erasing "+shape);
    }
}

class Circle extends Shape
{
    String shape="Circle";
    public void draw()
    {
        System.out.println("Drawing "+shape);
    }
    public void erase()
    {
        System.out.println("Erasing "+shape);
    }
}

class Triangle extends Shape
{
    String shape="Triangle";
    public void draw()
    {
        System.out.println("Drawing "+shape);
    }
    public void erase()
    {
        System.out.println("Erasing "+shape);
    }
}

class Square extends Shape
{
    String shape="Square";
    public void draw()
    {
        System.out.println("Drawing "+shape);
    }
    public void erase()
    {
        System.out.println("Erasing "+shape);
    }
}

class Test54
{
    public static void main(String[] args) {
        Shape c=new Circle();
        c.draw();
        c.erase();
        System.out.println();


        Shape t=new Triangle();
        t.draw();
        t.erase();
        System.out.println();


        Shape s=new Square();
        s.draw();
        s.erase();
        System.out.println();
    }
}
