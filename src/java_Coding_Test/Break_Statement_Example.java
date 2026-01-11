package java_Coding_Test;

public class Break_Statement_Example {
 //   Write a Java program to print numbers from 1 to 10,
 //   but stop the loop when the number becomes 5 using the break statement.
 static void main(String[] args) {
     int i;
     for(i=1;i<+10;i++){
         if(i==5)
             break;
         System.out.println(i);
     }
 }
}
