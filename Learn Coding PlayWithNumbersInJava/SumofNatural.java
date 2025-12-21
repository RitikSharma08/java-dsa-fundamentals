 // to print the sum of n natural number ..
 import java.util.Scanner;
public class SumofNatural {
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of terms :");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum=0;
        for(int i=1 ;i<=n ;i++) 
        {
            
            sum= sum +i;
        }
        System.out.println("Sum of natural numbers : "+sum) ;
    }
    
}
