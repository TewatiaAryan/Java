import java.util.*;
public class sliding_window_max_sum_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the size of sliding window : ");
        int window_size=sc.nextInt();
        int max=0;
        int[] arr2=new int[window_size];
        for(int i=0;i<=arr.length-window_size;i++){
            int sum=0;
            for(int j=i;j<window_size+i;j++)
                sum+=arr[j];
            if(sum>max) {
                max = sum;
                int k = 0;
                for (int j = i; j < window_size+i; j++){
                    arr2[k] = arr[j];
                    k++;
                }
            }
        }
        System.out.print("Maximum sum is : "+max+"and the elements are : ");
        for(int j=0;j<window_size;j++)
            System.out.print(arr2[j]+" ");
    }
}
