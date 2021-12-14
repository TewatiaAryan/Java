/* Create class point with following instance variable and methods. 
Instance variable: private int x,y
Constructors : public Point(), Point(int x, int y)
Methods : public void setX(int x), setY(int y), setXY(int x, int y) */

package com.company;
import java.util.*;
public class Point {
    private  int x,y;
    public Point()
    {
        x=0;
        y=0;
    }
    Point (int x,int y)
    {
      this.x=x;
      this.y=y;
    }

    public void setX(int x)
    {
        this.x=x;
        System.out.println("Value of x is "+x);
    }
    public void setY(int y)
    {
        this.y=y;
        System.out.println("Value of y is "+y);
    }
    public void setXY(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.print("Value of x and y respectively is "+x);
        System.out.println(" "+y);
    }

    public static void main(String[] args) {
     Point obj1=new Point();
     Scanner s=new Scanner(System.in);

        System.out.println("Enter the value of x and y");
     Point obj2 =new Point(s.nextInt(),s.nextInt());

        System.out.println("Enter value of x");
        obj1.setX(s.nextInt());

        System.out.println("Enter the value of y");
        obj1.setY(s.nextInt());

        System.out.println("Enter the value of x and y ");
        obj1.setXY(s.nextInt(),s.nextInt());


    }
}
