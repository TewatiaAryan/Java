/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed */



package com.company;
import java.util.*;
public class Programming {
    String lang;
    Programming()
    {
        System.out.println("I love programming languages");
    }
    Programming(String lang)
    {
        this.lang=lang;
        System.out.println("I love "+lang);
    }

    public static void main(String[] args) {
        String choice;
        Scanner s=new Scanner(System.in);
        System.out.println("if you love some specific language then enter yes otherwise no");
        choice=s.nextLine();
        if(choice.equals("yes"))
        {
            String language;
            System.out.println("Enter your favourite programming language");
            language=s.next();
            Programming obj1=new Programming(language);
        }
        if(choice.equals("no"))
        {
            Programming obj2=new Programming();
        }
    }
}
