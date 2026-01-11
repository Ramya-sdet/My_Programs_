package java_Coding_Test;

import java.util.Scanner;

public class Positive_Negative_Or_Zero {
    static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number");
        int A=s.nextInt();
        if(A>0){
            System.out.println("Number is positive");
        } else if (A<0) {
            System.out.println("Number is Negative");
        }else {
            System.out.println("Zero");
        }
    }
}
