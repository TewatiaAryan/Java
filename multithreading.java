/*
Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join.     (use of join method and thread control mechanism)
*/

package com.company;


class Even extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}

class Odd extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
}



public class Multi3 {
    public static void main(String[] args) throws InterruptedException {
        Even e=new Even();
        e.start();

        Odd o = new Odd();
        o.start();
        o.join();
    }
}
