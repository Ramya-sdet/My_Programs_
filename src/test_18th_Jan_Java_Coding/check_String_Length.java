package test_18th_Jan_Java_Coding;

import java.util.Scanner;

public class check_String_Length {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = s.nextLine();
        if (st.length() > 10) {
            System.out.println("Length of string is Greater than 10");
        } else {
            System.out.println("Length of string is less than 10");
        }
    }
}
