package java_Coding_Test;

import java.util.Scanner;

public class Reverse_A_Number {
    static void main(String[] args) {

        System.out.println("Reverse of number");
        reverse();
    }

    static int reverse() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = a.nextInt();
        int rev = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
        return rev;
    }
}
