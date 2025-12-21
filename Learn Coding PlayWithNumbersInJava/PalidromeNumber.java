 // Palidrome Number Program
 //Example-- Input number 121 is 121
 import java.util.Scanner;
public class PalidromeNumber {
    public static void main(String[]args)
    {
        int num , c, r ,s=0;
        System.out.println("Enter the number :");
        Scanner obj =new Scanner(System.in);
         num = obj.nextInt();

         c=num;
         while(num>0)
         {
            r=num%10;
            s=(s*10)+r;
            num=num/10;
         }
         if(c==s)
         {
            System.out.println("Palidrome number");
         }
         else 
         System.out.println("Not a Palidrome Number");
    }
    
}
