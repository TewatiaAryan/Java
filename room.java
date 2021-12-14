//Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores Boolean values to indicate whether the appliance is ON or OFF. Design a menu driven program in java that puts ON/OFF the corresponding appliances and gives appropriate message. If the total power consumed is more than 2kW, show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts, Fan consumes 400 watts and light consumes 100 watt.

package com.company;
import java.util.*;
public class Room {
    boolean AC_ON,HOME_THEATRE_ON,FAN_ON,LIGHT_ON;

    Room(boolean a,boolean h,boolean f,boolean l)
    {
        AC_ON=a;
        HOME_THEATRE_ON=h;
        FAN_ON=f;
        LIGHT_ON=l;
    }
    public void status()
    {
        int power=0;
        if(AC_ON==true)
        {
            power+=1200;
        }
        if(HOME_THEATRE_ON==true)
        {
            power+=600;
        }
        if(FAN_ON==true)
        {
            power+=400;
        }
        if(LIGHT_ON==true)
        {
            power+=100;
        }
        if(power>2000)
            System.out.println("Overload");
        else
            System.out.println("Your power consumption is "+power);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("if your device is on then enter true and if off then enter false");
        System.out.println();
        System.out.println("Enter the condition of AC,Home theatre,fan and light");
        Room obj=new Room(s.nextBoolean(),s.nextBoolean(),s.nextBoolean(),s.nextBoolean());
        obj.status();
    }
}
