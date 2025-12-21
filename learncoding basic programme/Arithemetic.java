/* Arithemetic operator example (Basic Calculator) */
import java.util.Scanner;
public class Arithemetic {
    public static void main(String[] args) {
    System.out.println("enter any two numbers :");
    Scanner obj = new Scanner(System.in);
      int a = obj.nextInt(); 
      int b = obj.nextInt();
      System.out.println("Addition :"+(a+b));
      System.out.println("subtract :"+(a-b));
      System.out.println("multiplication :"+(a*b));
      System.out.println("Division :"+(a/b));
      System.out.println("Remainder:"+(a%b));

    }
    
}
