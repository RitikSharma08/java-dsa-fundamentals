    // Average of three numbers 
import java.util.Scanner;  
public class userinput {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
         String name=sc.nextLine();
         System.out.println("Average of three numbers");
        int a =sc.nextInt();
        int b =  sc.nextInt();
        int c=sc.nextInt();
        int result=(a+b+c)/3;
        System.out.println("your name is "+name);
        System.out.println("Avreage of three number ="+result );
   }
    
}
