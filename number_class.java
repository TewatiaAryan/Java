/* Create class Number with only one private instance variable as a int primitive type. Initialize it with parameterised constructor and include the following methods  isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() 
the above methods return boolean primitive type value. 
getFactorial(), getSqrt(), getSqr(), sumDigits()  these methods return int primitive type value.  
dispBinary(), dispOctal(), displayhexa() these method return string value */



package com.company;
import java.util.Scanner;
public class Number {
    private int n;

    //Parameterised constructor

    Number(int n)
    {
        this.n=n;
    }

    //for checking the number is zero or not

    boolean isZero()
    {
        boolean f1=false;
        if(n==0)
            f1=true;
        System.out.println("This function returns true if the number is zero");
        return f1;
    }

    //for checking whether the number is positive or not

    boolean isPositive()
    {
        boolean f2=false;
        if(n>0)
            f2=true;
        System.out.println("This function returns true if the no is positive");
        return f2;
    }

    //for checking the number is negative or not

    boolean isNegative()
    {
        boolean f3=false;
        if(n<0)
            f3= true;
        System.out.println("This function returns true if given number is negative");
        return f3;
    }

    //for checking the number is odd or not

    boolean isOdd()
    {
        boolean f4=false;
        if((n%2)!=0)
            f4=true;
        System.out.println("This functon return true if the given number is odd");
        return f4;
    }

    //for checking the number is even or not

    boolean isEven()
    {
        boolean f5=false;
        if(n%2==0)
            f5=true;
        System.out.println("This function returns true if the given number is even");
        return f5;
    }

    //for checking the number is prime or not

    boolean isPrime()
    {
        boolean flag=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        System.out.println("This function returns true if the number is prime");
        return flag;
    }

    //for checking the number is armstrong or not

    boolean isArmstrong()
    {
        boolean f6=false;
        int length=0;
        int x3=n;
        int temp=n;
        int sum=0;
        int x=0;
        int x2=n;
        while (temp > 0)
        {
            temp=temp/10;
            length++;
        }
        while(x3>0)
        {
            x=x3%10;
            sum = (int) (sum+ Math.pow(x, length));
            x3=x3/10;
        }
        if(sum==x2)
        {
            f6=true;
        }
        System.out.println("This function returns true if the given number is armstrong ");
        return f6;
    }

    //for getting the factorial of the number

    int getFactorial()
    {
        int fact=1;
       for(int i=1;i<=n;i++)
       {
           fact*=i;
       }
        System.out.print("The factorial of the given number is ");
        return fact;
    }

    //for getting the square root of the number

    int getSqrt()
    {
        int s=(int) Math.sqrt(n);
        System.out.print("The square root of given number in integer part is ");
        return s;
    }

    //for getting the square of the number

    int getSqr()
    {
        int square=n*n;
        System.out.print("The square of the given number is ");
        return square;
    }

    //for getting the sum of the digits of the number

    int sumDigits()
    {
        int x4=n;
        int split=0;
        while(x4>0)
        {
            split=split+(x4%10);
            x4/=10;
        }
        System.out.print("The sum of digits of the given number is ");
        return split;
    }

    //for finding the binary of the number

    String dispBinary()
    {
        String binary;
        binary=Integer.toBinaryString(n);
        System.out.print("The binary of given number is ");
        return binary;
    }

    //for finding the octal of the number

    String dispOctal()
    {
        String octal;
        octal=Integer.toOctalString(n);
        System.out.print("The octal representation of given number is ");
        return octal;
    }

    //for finding the hexadecimal of the nu+mber

    String displayHexa()
    {
        String hexa;
        hexa=Integer.toHexString(n);
        System.out.print("The hexadecimal representation of given number is ");
        return hexa;
    }

    //main method
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        Number obj=new Number(s.nextInt());

        System.out.println(obj.isZero());
        System.out.println(obj.isPositive());
        System.out.println(obj.isNegative());
        System.out.println(obj.isOdd());
        System.out.println(obj.isEven());
        System.out.println(obj.isPrime());
        System.out.println(obj.isArmstrong());

        System.out.println(obj.getFactorial());
        System.out.println(obj.getSqrt());
        System.out.println(obj.getSqr());
        System.out.println(obj.sumDigits());

        System.out.println(obj.dispBinary());
        System.out.println(obj.dispOctal());
        System.out.println(obj.displayHexa());
    }
}
