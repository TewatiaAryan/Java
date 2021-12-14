//Write a program that will check whether a given String is Palindrome or not.

package com.company;
import java.util.*;
public class PalString {
    String input;

    PalString( String input) {
        this.input = input;
    }

    public void isPal() {
        int i = 0, j = input.length()- 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                System.out.println("Not Palindrone");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Palindrone");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p;
        System.out.println("Enter the string");
        p=s.nextLine();
        PalString obj=new PalString(p);
        obj.isPal();
    }
}
