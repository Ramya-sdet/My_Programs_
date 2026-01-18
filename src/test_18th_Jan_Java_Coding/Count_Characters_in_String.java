package test_18th_Jan_Java_Coding;

import java.util.Scanner;

public class Count_Characters_in_String {
    static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String Ch=s.nextLine();
        int count=0;
        for(int i=0;i<Ch.length();i++){
            if(Ch.charAt(i)!=' ')
                count++;
        }
        System.out.println(count);
    }
}
