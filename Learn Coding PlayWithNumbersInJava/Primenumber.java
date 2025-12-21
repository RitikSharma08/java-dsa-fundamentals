 // To find given number is prime number or not.
  //inputnumber----- 7 is prime number
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        int num ,count=0;
        System.out.println("Enyter the number :");
        Scanner obj= new Scanner(System.in);
        num=obj.nextInt();

        for(int i=1; i<=num ; i++)
        {
            if(num%i==0)
            {
                count++; 
            }     
        }
         if(count==2)
         System.out.println("Prime number");
         else 
         System.out.println("Not a prime number");
   }
    
}
