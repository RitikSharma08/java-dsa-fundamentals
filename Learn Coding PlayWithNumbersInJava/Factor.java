  //  To Find the factor of given number 
//  Example -->  10 Input number factor ---- 1 ,2 ,5 ,10 .
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner obj =new Scanner(System.in);
        int num = obj.nextInt();

        System.out.println("factor of given number is : ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
             int factnum = i;
            System.out.print(" "+factnum);
            }
        }
    }
}
