   // Perfect Number
   // Input number 6-----> 1,2,3,4,5
   //  6----> 1+2+3=6
import java.util.Scanner;
public class Perfectnumber {
    public static void main(String[] args) {
        int num ,i,temp,store=0;
        System.out.println("Enter the number");
        Scanner r =new Scanner(System.in);
        num =r.nextInt();

        temp=num;

        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                store = store + i ;
            }
        }
            if(temp==store)
            System.out.println("Perfect number");
            else 
            System.out.println("Not a Perfect number");

    }
    
}
