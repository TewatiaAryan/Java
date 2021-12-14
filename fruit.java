//Create a base class Fruit which has name, taste and size as its attributes. A method called eat() is created which describes the name of the fruit and its taste.  Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.


package com.company;
import java.util.Scanner;
public class Fruit
{
    String name,taste;
    int size;
    public static void eat(String name,String taste)
    {

    }
}

class Apple extends Fruit{
    int size;
    String taste,name;
    Apple(int size,String name,String taste)
    {
        this.size=size;
        this.name=name;
        this.taste=taste;
        System.out.println("Size of the apple is "+size);
    }
    public static  void eat(String name,String taste)
    {
        System.out.println("The name of fruit is "+name);
        System.out.println("Taste of "+name +" is "+taste);
    }
}

class Orange extends Fruit{
    int size;
    String name,taste;

    Orange(int size,String name,String taste)
    {
        this.size=size;
        this.name=name;
        this.taste=taste;
        System.out.println("Size of the orange is "+size);
    }
    public static void eat(String name,String taste)
    {
        System.out.println("The name of fruit is "+name);
        System.out.println("Taste of orange is "+taste);
    }
}

class Driver12
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the fruit name,taste");
        String n1=s.nextLine();
        String t1=s.nextLine();
        System.out.println("Enter the size");
        Apple obj1=new Apple(s.nextInt(),n1,t1);
        Apple.eat(n1,t1);
        System.out.println();


        System.out.println("Enter the fruit name,taste ");
        String n2=s.nextLine();
        String t2=s.nextLine();
        System.out.println("Enter the size ");
        Orange obj2=new Orange(s.nextInt(),n2,t2);
        Orange.eat(n2,t2);
    }
}
