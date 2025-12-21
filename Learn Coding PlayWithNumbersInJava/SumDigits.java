// Sum of Digits 
// 345---->3+4+5=12
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        int rem,sum=0;
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        
        System.out.println("Sum of "+num+"is :");
        while(num>0)
        {
        rem=num%10;
        num=num/10;
        sum= sum+rem;
        }
        System.out.print(sum);

    }
    
}
