// Create an int array of size 5, initialize it with values(10,20,30,40,50). Create a public boolean search(int arr[], int search_element) this method will return true if the search element is present in the array else it will  print a message "element not found"

import java.util.Scanner;
public class Array {
    int arr[]={10,20,30,40,50};
    boolean flag=false;
    public boolean search (int search_element)
    {
        for(int i=0;i<5;i++)
        {
            if(arr[i]==search_element)
            {
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element you want to be search");
        Array obj=new Array();
        System.out.println(obj.search(s.nextInt()));
    }

}
