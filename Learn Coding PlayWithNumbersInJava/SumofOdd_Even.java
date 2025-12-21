/* Print the Sum of even number & odd number in given range*/
// Even 10 (0+2+4+6+8+10 = 30)
// odd 11  (1+3+5+7+9+11) = 36 )
import java.util.Scanner;
public class SumofOdd_Even {
    public static void main(String[] args) {
        int num ,sum=0;
        System.out.println("Enter the given range :");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();

        if(num%2==0)
        {
          for(int i=0;i<=num;i=i+2)
          {
            sum=sum+i;
          }
          System.out.println("Sum of given range even number is : "+sum);
        }
        else
        {
            for(int i=1;i<=num;i++)
            {
              sum=sum+i;
              i++;
            }
            System.out.println("Sum of given range odd number is : "+sum);
        }
    }
    
}
