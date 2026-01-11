package java_Coding_Test;

import java.util.Scanner;

public class Maximum_of_Two_Numbers {
    //Write a Java program to find the maximum of two numbers using the ternary operator.
    static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int x =s.nextInt();
        int y =s.nextInt();
        int res = ((x > y) ? x : y);
        System.out.println("Maximum_of_Two_Numbers is: "+res);
    }
}
