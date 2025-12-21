// Programe to find the factorial of given number using Recursion
import java.util.Scanner;
public class FactorialRecursion1 {
    int num;
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
       

        FactorialRecursion1 r= new FactorialRecursion1();
        int result=r.fact( num);            // calling
        System.out.println("Factorial of given number is : "+result);
    }

    int fact( int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        else
        return num*(fact (num-1)); // recurion calling
    }
}
