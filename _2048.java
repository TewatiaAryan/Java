import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class _2048{
    public static void give_value(Random rnd1,int size,int[] value,int[][] main,int n){
        ArrayList<int[]> Zero=new ArrayList();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(main[i][j]==0){
                    int[] index = new int [2];
                    index[0]=i;
                    index[1]=j;
                    Zero.add(index);
                }
            }
        }
        int n1=rnd1.nextInt(Zero.size());
        if(n==2){
            int n2= rnd1.nextInt(Zero.size());
            while(n1==n2)
                n2=rnd1.nextInt(Zero.size());
            int[] array1=Zero.get(n2);
            main[array1[0]][array1[1]]=value[rnd1.nextInt(2)];
        }
        int[] array2=Zero.get(n1);
        main[array2[0]][array2[1]]=value[rnd1.nextInt(2)];
    }
    public static int check_game(int size, int[][] main){
        int k=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                if(main[i][j]==0)
                    return 1;
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int a=i,b=j;
                int[] arr2=new int[5];
                arr2[0]=main[i][j];
                // Corner Elements
                if(a==0 && b==0){
                    arr2[2]=main[a][b+1];             //Right
                    arr2[4]=main[a+1][b];             //Down
                }
                else if(a==size-1 && b==0){
                    arr2[2]=main[a][b+1];             //Right
                    arr2[3]=main[a-1][b];             //Up
                }
                else if(a==size-1 && b==size-1){
                    arr2[1] = main[a][b-1];           // Left
                    arr2[3]=main[a-1][b];             //Up
                }
                else if(a==0 && b==size-1){
                    arr2[1] = main[a][b-1];           // Left
                    arr2[4]=main[a+1][b];             //Down
                }
                //Edges Mid Elements
                else if(a==0 && b<size-1 && b!=0){
                    arr2[1] = main[a][b-1];           // Left
                    arr2[2]=main[a][b+1];             //Right
                    arr2[4]=main[a+1][b];             //Down
                }
                else if(b==0 && a!=0 && a<size-1){
                    arr2[2]=main[a][b+1];             //Right
                    arr2[3]=main[a-1][b];             //Up
                    arr2[4]=main[a+1][b];             //Down
                }
                else if(a==size-1 && b!=0 && b<size-1){
                    arr2[1] = main[a][b-1];           // Left
                    arr2[2]=main[a][b+1];             //Right
                    arr2[3]=main[a-1][b];             //Up
                }
                else if(b==size-1 && a<size-1 && a!=0){
                    arr2[1] = main[a][b-1];           // Left
                    arr2[3]=main[a-1][b];             //Up
                    arr2[4]=main[a+1][b];             //Down
                }
                //Centralized Elements
                else{
                    arr2[1] = main[a][b-1];           // Left
                    arr2[2]=main[a][b+1];             //Right
                    arr2[3]=main[a-1][b];             //Up
                    arr2[4]=main[a+1][b];             //Down
                }
                int m=0;
                for(int n=1;n<5;n++)
                    if(arr2[n]!=arr2[0])
                        m+=1;
                if(m==4)
                    k+=1;
            }
        }
        if(k==Math.pow(size,2))
            return 2;
        return 0;
    }
    public static void Right(Random rnd1,int[] value,int size,int[][] main,int h,int v){
        int f=0;
        if(v>h-2){
            for(int i=0;i<size;i++) {
                for (int j = 0; j < size - 1; j++){
                    while(main[i][j]==0 && j<size-2)
                        j++;
                    if (main[i][j] != main[i][j + 1])
                        f += 1;
                }
            }
        }
        if(f!=size*(size-1)){
            for(int i=0;i<size;i++){
                ArrayList<Integer> Line= new ArrayList<>();
                for(int j=size-1;j>=0;j--)
                    if(main[i][j]!=0)
                        Line.add(main[i][j]);
                add(Line);
                int z=0;
                for(int j=size-1;j>=0;j--){
                    if(z<Line.size())
                        main[i][j]=Line.get(z++);
                    else
                        main[i][j]=0;
                }
            }
            give_value(rnd1, size, value, main, 1);
            print(size,main);
        }
        else
            System.out.println("NOT POSSIBLE , TRY ANOTHER DIRECTION !!");
    }
    public static void Down(Random rnd1,int[] value,int size,int[][] main,int h,int v){
        int f=0;
        if(v>h-2) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size; j++) {
                    while (main[i][j] == 0 && i < size - 2)
                        i++;
                    if (main[i][j] != main[i + 1][j])
                        f += 1;
                }
            }
        }
        if(f!=size*(size-1)) {
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> Line = new ArrayList<>();
                for (int i = size - 1; i >= 0; i--)
                    if (main[i][j] != 0)
                        Line.add(main[i][j]);
                add(Line);
                int z = 0;
                for (int i = size - 1; i >= 0; i--) {
                    if (z < Line.size())
                        main[i][j] = Line.get(z++);
                    else
                        main[i][j] = 0;
                }
            }
            give_value(rnd1, size, value, main, 1);
            print(size, main);
        }
        else
            System.out.println("NOT POSSIBLE , TRY ANOTHER DIRECTION !!");
    }
    public static void Left(Random rnd1,int[] value,int size,int[][] main,int h,int v){
        int f=0;
        if(v>h-2) {
            for (int i = 0; i < size; i++) {
                for (int j = size - 1; j > 0; j--) {
                    while (main[i][j] == 0 && j > 1)
                        j--;
                    if (main[i][j] != main[i][j - 1])
                        f += 1;
                }
            }
        }
        if(f!=size*(size-1)){
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> Line = new ArrayList<>();
                for (int j = 0; j < size; j++)
                    if (main[i][j] != 0)
                        Line.add(main[i][j]);
                add(Line);
                int z = 0;
                for (int j = 0; j < size; j++) {
                    if (z < Line.size())
                        main[i][j] = Line.get(z++);
                    else
                        main[i][j] = 0;
                }
            }
            give_value(rnd1, size, value, main, 1);
            print(size, main);
        }
        else
            System.out.println("NOT POSSIBLE , TRY ANOTHER DIRECTION !!");
    }
    public static void Up(Random rnd1,int[] value,int size,int[][] main,int h,int v){
        int f=0;
        if(v>h-2) {
            for (int i = size - 1; i > 0; i--) {
                for (int j = 0; j < size; j++) {
                    while (main[i][j] == 0 && i > 1)
                        i--;
                    if (main[i][j] != main[i - 1][j])
                        f += 1;
                }
            }
        }
        if(f!=size*(size-1)) {
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> Line = new ArrayList<>();
                for (int i = 0; i < size; i++)
                    if (main[i][j] != 0)
                        Line.add(main[i][j]);
                add(Line);
                int z = 0;
                for (int i = 0; i < size; i++) {
                    if (z < Line.size())
                        main[i][j] = Line.get(z++);
                    else
                        main[i][j] = 0;
                }
            }
            give_value(rnd1, size, value, main, 1);
            print(size, main);
        }
    }
    public static void add(ArrayList<Integer> Line){
        for(int k=0;k<Line.size();k++)
            if((k+1)<Line.size() && (Line.get(k)==Line.get(k+1))) {
                Line.set(k, (Line.get(k) + Line.get(k + 1)));
                Line.remove(k + 1);
            }
    }
    public static void print(int size,int[][] main){
        System.out.println();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                System.out.print("  "+main[i][j]+"  ");
            System.out.println("\n");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd1=new Random();
        System.out.print("Enter the size of the Grid : ");
        int size=sc.nextInt();
        int h= (int) Math.pow(size,2);
        int[] value={2,4};
        int[][] main=new int[size][size];
        give_value(rnd1, size, value, main, 2);
        System.out.println("\nYOUR GAME STARTS HERE :- \n");
        print(size,main);
        System.out.println("\nGIVE INSTRUCTIONS : ");
        System.out.println("Press R for RIGHT movement \nPress L for LEFT movement \nPress U for UP movement \nPress D for DOWN movement \n");
        int v=0;
        while(true){
            if(check_game(size,main)==2){
                System.out.println("GAME OVER !!!");
                break;
            }
            String str=sc.next();
            if(str.equalsIgnoreCase("R"))
                Right(rnd1,value,size,main,h,v);
            else if(str.equalsIgnoreCase("L"))
                Left(rnd1,value,size,main,h,v);
            else if(str.equalsIgnoreCase("U"))
                Up(rnd1,value,size,main,h,v);
            else if(str.equalsIgnoreCase("D"))
                Down(rnd1,value,size,main,h,v);
            else
                System.out.println("INVALID INPUT !!");
            int q=0;
            v++;
            if(v>512){
                for(int i=0;i<size;i++){
                    for(int j=0;j<size;j++)
                        if(main[i][j]==2048){
                            System.out.println("YOU WON !! \nPress 1 to end game \n Press 2 to continue\n");
                            q=sc.nextInt();
                            break;
                        }
                }
            }
            if(q==1)
                break;
        }
    }
}
