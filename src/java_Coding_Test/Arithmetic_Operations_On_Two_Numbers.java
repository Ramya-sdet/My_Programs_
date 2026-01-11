package java_Coding_Test;

import java.util.Scanner;

public class Arithmetic_Operations_On_Two_Numbers {
    //Write a Java program that takes two integer numbers and prints their sum,
    // difference, multiplication, division, and remainder.
    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two integer Numbers");
        int a = cal(s,"Enter 1st number");
        int b =cal(s,"Enter 2nd number") ;
        int sum;
        int difference;
        int multiplication;
        int division;
        int remainder;
        sum = a + b;
        difference = a - b;
        multiplication = a * b;
        division = a / b;
        remainder = a % b;
        System.out.println("Sum of two integer numbers = " + sum);
        System.out.println("difference of two integer numbers = " + difference);
        System.out.println("multiplication of two integer numbers = " + multiplication);
        System.out.println("division of two integer numbers = " + division);
        System.out.println("remainder after dividing two integer numbers = " + remainder);

        s.close();

        }
    public static int cal(Scanner s,String input){
        if (s.hasNextInt()) {
            return s.nextInt();

        } else {
            System.out.println("Enter valid integer number");
            System.exit(0);
            return 0;
        }

    }
}

