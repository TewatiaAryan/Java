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
    public static void Right(Random rnd1,int[] value,int size,int[][] main){
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
    public static void Down(Random rnd1,int[] value,int size,int[][] main){
        for(int j=0;j<size;j++){
            ArrayList<Integer> Line= new ArrayList<>();
            for(int i=size-1;i>=0;i--)
                if(main[i][j]!=0)
                    Line.add(main[i][j]);
            add(Line);
            int z=0;
            for(int i=size-1;i>=0;i--){
                if(z<Line.size())
                    main[i][j]=Line.get(z++);
                else
                    main[i][j]=0;
            }
        }
        give_value(rnd1, size, value, main, 1);
        print(size,main);
    }
    public static void Left(Random rnd1,int[] value,int size,int[][] main){
        for(int i=0;i<size;i++){
            ArrayList<Integer> Line= new ArrayList<>();
            for(int j=0;j<size;j++)
                if(main[i][j]!=0)
                    Line.add(main[i][j]);
            add(Line);
            int z=0;
            for(int j=0;j<size;j++){
                if(z<Line.size())
                    main[i][j]=Line.get(z++);
                else
                    main[i][j]=0;
            }
        }
        give_value(rnd1, size, value, main, 1);
        print(size,main);
    }
    public static void Up(Random rnd1,int[] value,int size,int[][] main){
        for(int j=0;j<size;j++){
            ArrayList<Integer> Line= new ArrayList<>();
            for(int i=0;i<size;i++)
                if(main[i][j]!=0)
                    Line.add(main[i][j]);
            add(Line);
            int z=0;
            for(int i=0;i<size;i++){
                if(z<Line.size())
                    main[i][j]=Line.get(z++);
                else
                    main[i][j]=0;
            }
        }
        give_value(rnd1, size, value, main, 1);
        print(size,main);
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
        int max = (int) Math.pow(size, 2);
        int[] value={2,4};
        int[][] main=new int[size][size];
        give_value(rnd1, size, value, main, 2);
        System.out.println("\nYOUR GAME STARTS HERE :- \n");
        print(size,main);
        System.out.println("\nGIVE INSTRUCTIONS : ");
        System.out.println("Press R for RIGHT movement \nPress L for LEFT movement \nPress U for UP movement \nPress D for DOWN movement \n");
        while(true){
            String str=sc.next();
            if(str.equalsIgnoreCase("R"))
                Right(rnd1,value,size,main);
            else if(str.equalsIgnoreCase("L"))
                Left(rnd1,value,size,main);
            else if(str.equalsIgnoreCase("U"))
                Up(rnd1,value,size,main);
            else if(str.equalsIgnoreCase("D"))
                Down(rnd1,value,size,main);
            else
                System.out.println("INVALID INPUT !!");
            int q=0;
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(main[i][j]==2048){
                        System.out.println("Press 1 to end game \n Press 2 to continue\n");
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
