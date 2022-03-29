import java.util.*;
public class linear_search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter in the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements in the array : ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the value you want to search in the array : ");
        int x=sc.nextInt();
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
               a+=1;
        }
        if(a!=0)
            System.out.println("Yes the element is present "+a+" times !!!");
        else
            System.out.println("No the element is not present in the array !!!");
    }
}
