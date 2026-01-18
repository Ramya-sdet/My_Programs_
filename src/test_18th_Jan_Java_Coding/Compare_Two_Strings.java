package test_18th_Jan_Java_Coding;

import java.util.Scanner;

public class Compare_Two_Strings {
    static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String s1=s.nextLine();
        System.out.println("Enter the 2nd String");
        String s2=s.nextLine();
        if(s1.equals(s2)){
            System.out.println("Both the strings are equal");

        }else {
            System.out.println("strings are Not equal");
        }
    }
}
