import java.util.*;
public class bubble_sort{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many elements you want to enter in the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int i=0;i<(n-1);i++){
                if(arr[i]>arr[i+1]){       //Ascending order
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.print("Ascending order of the array is : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.print("\nDescending order of the array is : ");
        for(int i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}
