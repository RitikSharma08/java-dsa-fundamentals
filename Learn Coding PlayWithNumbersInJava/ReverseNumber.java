// Reverse the number 
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int rem;
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        
        System.out.println("Reverse no : ");
        while(num>0)
        {
        rem=num%10;
        num=num/10;
        System.out.print(rem);
        }
    }
    
}
