package java_Coding_Test;

import java.util.Scanner;
//Write a Java program to check whether a given number is even or odd
// using arithmetic operators.

public class Even_Or_Odd_Number {
     public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
         System.out.println("Enter interger number ");
        if(s.hasNext()) {
            int x=s.nextInt();
            if (x % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("number is odd");
            }
            s.close();
        }else {
            System.out.println("Enter only interger number ");
        }
    }
}
