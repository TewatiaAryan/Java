import java.util.Scanner;
public class zero_in_factorial_output{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1,rem,k=0;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        while(fact!=0){
            rem=fact%10;
            fact/=10;
            if(rem==0){
                k++;
            }
        }
        System.out.print(k);
    }
}
