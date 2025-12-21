 /*  Find to odd and even number .. */
 import java.util.Scanner;
 public class Odd_Even
{
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number:");
        Scanner obj =new Scanner (System.in);
        a=obj.nextInt();
        if(a%2==0)
        System.out.println(" Given number is Even number : "+a);
        else 
        System.out.println("Given  number is Odd number : "+a);

    }

 }