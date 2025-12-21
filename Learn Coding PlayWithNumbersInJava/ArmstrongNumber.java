// Finding the number is Armstrong or not
// input number 153---> (1*1*1 + 5*5*5 + 3*3*3 = 153 ) 
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num ,temp ,rem,arm=0;
        System.out.println("Enter the number :");
        Scanner obj =new Scanner(System.in);
        num=obj.nextInt();

        temp=num;
        
        while(num>0)
        {
            rem=num%10;
            arm=(rem*rem*rem)+arm ;
            num=num/10;
        }
        if(temp==arm)
            System.out.println("Armstrong number");
        else 
            System.out.println("Not armstrong number ");
    }
    
}
