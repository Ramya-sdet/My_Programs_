package java_Coding_Test;

import java.util.Scanner;

public class Day_Of_The_Week {
    //Write a Java program to print the name of the day based on a number (1–7)
    // using a switch statement.
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 1-7");
        int A = s.nextInt();
        switch(A){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
