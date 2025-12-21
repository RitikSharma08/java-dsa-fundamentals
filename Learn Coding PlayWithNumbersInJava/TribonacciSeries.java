// Wap to print the TribonacciSeries..
// 0 1 2 3 6 11 20
import java.util.Scanner;
public class TribonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,c=2,d;
        System.out.println("Enter the term :");
        Scanner obj=new Scanner(System.in);
        int term= obj.nextInt();
       System.out.println("Tribonacci Series : ");

        for(int i=1; i<=term;i++)
        {
            System.out.print(" "+a);
            d=a+b+c;
            a=b;
            b=c;
            c=d; 
        }

    }
}
