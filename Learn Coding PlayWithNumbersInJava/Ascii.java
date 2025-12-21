 // Print the ASCII value of the character
 // A is ASCII CODE is 65
 import java.util.Scanner;
 public class Ascii {
     public static void main(String[] args) {
         System.out.println("Enter the character :");
         Scanner obj = new Scanner(System.in);
         char ch = obj.next().charAt(0); //used for charcter input
 
         int a = ch; //implicit typecasting
         System.out.println("ASCII code of given character "+ ch + " is "+a);
         
     }
     
 }
 
