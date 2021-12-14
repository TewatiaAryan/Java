/* Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank. */


package com.company;
import java.util.*;
public class AddAmount {
    public int amount=50;
    AddAmount()
    {
        System.out.println("Total money in piggy bank "+amount);
    }
    AddAmount(int money)
    {
        amount+=money;
        System.out.println("Total money in piggy bank "+amount);
    }

    public static void main(String[] args) {
        String choice=null;
        Scanner s=new Scanner(System.in);
        System.out.println("if you want to add money then enter yes otherwise no ");
        choice=s.nextLine();
        if(choice.equals("yes"))
        {
            System.out.println("Enter the money you want to add");
            AddAmount obj1=new AddAmount(s.nextInt());
        }
        if(choice.equals("no"))
        {
            AddAmount obj2=new AddAmount();
        }
    }
}
