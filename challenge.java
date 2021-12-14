/*A library needs to develop an online application for two types of users/roles, Adults and children. Both of these users should be able to register an account
Any user who is less than 12 years of age will be registered as a child and they can borrow a “Kids” category book for 10 days, whereas an adult can borrow “Fiction” category books which need to be returned within 7 days. 

Note: In future, more users/roles might be added to the library where similar rules will be enforced. 

Develop Interfaces and classes for the categories mentioned above.  
1. Create an interface LibraryUser with the following methods declared,
Method Name
registerAccount
requestBook
2. Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser interface.

3.  Both the classes should have two instance variables as specified below.
Instance variables  Data type
age int
bookType String



4. The methods in the KidUser class should perform the following logic. 
registerAccount function:
if age < 12, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console. 
If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the console. 
requestBook function: 
if bookType is “Kids”, a message displaying “Book Issued successfully, please return the book within 10 days” should be displayed in the console. 
Else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console. 
5. The methods in the AdultUser class should perform the following logic. 

registerAccount  function:
if age > 12, a message displaying “You have successfully registered under an Adult Account” should be displayed in the console.
If age<12, a message displaying, “Sorry, Age must be greater than 12 to register as an adult” should be displayed in the console.
requestBook function:
if bookType is “Fiction”, a message displaying “Book Issued successfully, please return the book within 7 days” should be displayed in the console.
Else, a message displaying, “Oops, you are allowed to take only adult Fiction books” should be displayed in the console.
6. Create a class “LibraryInterfaceDemo.java” with a main method which performs the below functions,
Test case #1:
Create an instance of KidUser class. 
Set the age as specified in the below table and invoke the registerAccount method  of the  KidUser object

Age
10
18

Set the book Type as specified in the below table and invoke the requestBook method of the KidUser object,

BookType
“Kids”
“Fiction”

Test case #2:

Create an instance of AdultUser class. 
Set the age as specified in the below table and invoke the registerAccount method of the AdultUser object

Age
5
23

Set the book Type as specified in the below table and invoke the requestBook method of the  AdultUser  object
BookType
“Kids”
“Fiction”  */



//The code for the above problem is







package com.company;
import java.util.Scanner;
public interface LibraryUser {
    public abstract void registerAccount();
    public abstract void requestBook();
}

class KidUsers implements LibraryUser
{
    int age;
    String bookType;

    KidUsers(int age,String bookType)
    {
        this.age=age;
        this.bookType=bookType;
    }

   public void registerAccount()
    {
        if(age<=12)
        {
            System.out.println("You have successfully registered under a Kids Account");
        }
        if(age>12)
        {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    public void requestBook()
    {
        if(bookType.equals("Kids"))
        {
            System.out.println("Book Issued Successfully,please return the book within 10 days");
        }
        else
        {
            System.out.println("Oops,you are allowed to take only kids books");
        }
    }

}


class AdultUser implements LibraryUser
{
    int age;
    String bookType;

    AdultUser(int age,String bookType)
    {
        this.age=age;
        this.bookType=bookType;
    }

    public void registerAccount()
    {
        if(age>12)
        {
            System.out.println("You have successfully registered under an Adult Account");
        }
        else
        {
            System.out.println("Sorry,Age must be greater than 12  to register as an adult");
        }
    }

    public void requestBook()
    {
        if(bookType.equals("Fiction"))
        {
            System.out.println("Book Issued successfully please return the book within 7 days");
        }
        else
        {
            System.out.println("Oops you are allowed to take only Adult Fiction books");
        }
    }

}


class LibraryInterfaceDemo
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter age and booktype");
        KidUsers obj1=new KidUsers(s.nextInt(),s.next());
        obj1.registerAccount();
        obj1.requestBook();

        System.out.println("Enter age and booktype");
        AdultUser obj2=new AdultUser(s.nextInt(),s.nextLine());
        obj2.registerAccount();
        obj2.requestBook();
    }
}
