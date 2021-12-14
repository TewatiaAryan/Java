/* Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
If the inputs are "Hello" and "World", then the output is "HWeolrllod". */

package com.company;
import java.util.*;
public class Combination_Print {
    String s1, s2;

    Combination_Print(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void Result() {
        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 >= l2) {
            for (int i = 0; i < l1; i++) {
                if (i < l1) {
                    System.out.print(s1.charAt(i));
                }
                if (i < l2) {
                    System.out.print(s2.charAt(i));

                }
            }
        }
            if (l2 > l1) {
                for (int i = 0; i < l2; i++) {
                    if (i < l1) {
                        System.out.print(s1.charAt(i));
                    }
                    if (i < l2) {
                        System.out.print(s2.charAt(i));
                    }
                }
            }
        }
        public static void main (String[] args){
                Scanner s = new Scanner(System.in);
                String i1, i2;
                System.out.println("Enter the first string");
                i1 = s.nextLine();
                System.out.println("Enter the second string");
                i2 = s.nextLine();

                Combination_Print obj = new Combination_Print(i1, i2);
                obj.Result();
            }
        }
