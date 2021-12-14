/* Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
If the input is “Apple” then the output should be “ApApApApAp” */

package com.company;
import java.util.*;
public class Copies {
    String s;
    String s2="";
    Copies(String s)
    {
        this.s=s;
    }
    public String check()
    {
        if(s.length()<=2)
        {
            for(int i=0;i<s.length();i++)
            {
               s2=s2.concat(s);
            }
        }
        if(s.length()>2)
        {
            String s3=s.substring(0,2);
            for(int i=0;i<s.length();i++)
            {
                s2=s2.concat(s3);
            }
        }
        return s2;
    }

    public static void main(String[] args) {
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        str=s.nextLine();
        Copies cop=new Copies(str);
        System.out.println(cop.check());
    }
}
