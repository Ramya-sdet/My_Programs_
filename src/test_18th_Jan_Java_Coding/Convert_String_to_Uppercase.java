package test_18th_Jan_Java_Coding;

import java.util.Scanner;

public class Convert_String_to_Uppercase {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st=s.nextLine();
        String res=st.toUpperCase();
        System.out.println(res);

    }

}
