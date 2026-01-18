package test_18th_Jan_Java_Coding;

import java.util.Scanner;

public class reverse_String {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = s.nextLine();
        String rev = " ";
        char[] c = st.toCharArray();
        for (int i = c.length-1; i >=0 ; i--) {
            rev = rev + c[i];
        }
        System.out.println(rev);
    }
}