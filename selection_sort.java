import java.util.*;
public class selection_sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements you want to enter in the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[index])
                    index=j;
            }
            int x=arr[index];
            arr[index]=arr[i];
            arr[i]=x;
        }
        System.out.println("Ascending order");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
