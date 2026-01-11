package java_Coding_Test;

import java.util.Scanner;

public class Simple_Calculator {
    /*  Write a Java program to perform addition, subtraction, multiplication, or division
      based on user choice using a switch statement.*/
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two integer Numbers");
        int a = cal(s, "Enter 1st number");
        int b = cal(s, "Enter 2nd number");
        System.out.println("Enter 1-4 which operation to be performed \n" +
                "1-addition, 2-subtraction, 3-multiplication,4-division");
        int calculator=s.nextInt();
        int sum;
        int subtraction;
        int multiplication;
        int division;

        switch (calculator) {
            case 1:sum = a + b;
                System.out.println("sum of numbers = "+sum);
                break;
            case 2:subtraction = a - b;
                System.out.println("subtraction of numbers = "+subtraction);
                break;
            case 3: multiplication = a * b;
                System.out.println("multiplication of numbers = "+multiplication);
                break;
            case 4:division= (a / b);
                 System.out.println("division of numbers = "+division);
                break;
            default:
                System.out.println("invalid");

        }


    }
    public static int cal(Scanner s,String input) {
        if (s.hasNextInt()) {
            return s.nextInt();

        } else {
            System.out.println("Enter valid integer number");
            System.exit(0);
            return 0;
        }
    }
}
