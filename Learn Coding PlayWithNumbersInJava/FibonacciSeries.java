// Wap to print Fibonacci Series 
// 0 1 1 2 3 5 8 12 20  etc
import java.util.*;
public class FibonacciSeries {
    public static void main(String[]args)
    {
        int term ,a=0,b=1,c;
        System.out.println("Enter the number : ");
        Scanner obj= new Scanner(System.in);
        term=obj.nextInt();
        

         // For invalid input
         if(term<=0){
            System.out.println("Invalid Input");
           
        }

        else{
            // Print the fibonacci series

          System.out.println("Fibonacci series : ");
          for(int i=1;i<=term;i++)
          {
            System.out.print(" "+a);
            c=a+b;
            a=b;
            b=c;
          }
        }
   
       
    }
    
}
