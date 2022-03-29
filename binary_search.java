import java.util.*;
public class binary_search{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many elements you want to enter in the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of array in ascending/descending order : ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the element you want to search :");
        int x=sc.nextInt();
        int low=0,high=n-1,z=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                System.out.println("element is present at "+mid);
                z=1;
                break;
            }
            else if(x>arr[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        if(z==0)
            System.out.println("Element is not present !!!");
    }
}
