import java.util.*;  //  * = Random
public class dice_simulator{
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("How many times you want to simulate the dice : ");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            num=ran.nextInt(6)+1; // ran.nextInt will give a random value from 0 to 5
            System.out.println(num);
        }
    }
}
