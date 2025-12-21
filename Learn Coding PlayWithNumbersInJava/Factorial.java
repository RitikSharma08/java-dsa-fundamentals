 // To finding the factorial of given number ..
 import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num ,fact=1;
        System.out.println("Enter the number :");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        
        for(int i=1;i<=num;i++)
        { 
          fact =fact*i;
        }
       System.out.println("Factorial of given number : "+fact);   
    }
    
}
