//Write a program to initialize an integer array with values and check if a given number is present in the array or not.
//If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

import java.util.Scanner;
public class Array {
    int arr[]={10,20,30,40,50};
    boolean flag=false;
    public int  search (int search_element)
    {
        for(int i=0;i<5;i++)
        {
            if(arr[i]==search_element)
            {
                System.out.println(i);
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("-1");
        }
       
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element you want to be search");
        Array obj=new Array();
        obj.search(s.nextInt());
    }

}
