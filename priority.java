/*
Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time.
Observe the completion of the threads. (Thread priorities concept)
*/

package com.company;

class MyThread4 extends Thread
{
    public void run()
    {
        System.out.println("This is Thread 1");
    }
}

class MyThread5 extends Thread
{
    public void run()
    {
        System.out.println("This is Thread 2");
    }
}

class MyThread6 extends Thread
{
    public void run()
    {
        System.out.println("This is Thread 3");
    }
}


public class Multi5
{
    public static void main(String[] args) {
        MyThread4 m4=new MyThread4();
        m4.start();
        m4.setPriority(Thread.MIN_PRIORITY);


        MyThread5 m5 =new MyThread5();
        m5.start();
        m5.setPriority(Thread.NORM_PRIORITY);

        MyThread6 m6=new MyThread6();
        m6.start();
        m6.setPriority(Thread.MAX_PRIORITY);
    }
}
