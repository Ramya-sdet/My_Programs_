package java_Coding_Test;

import java.util.Scanner;

public class Explicit_Type_Casting {
    //Write a Java program to convert a double value into an int
    // using explicit type casting and print both values.
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        double a=s.nextDouble();
        int b=(int)a;
        System.out.println("double: "+a);
        System.out.println("int: "+b);
        s.close();
    }
}
