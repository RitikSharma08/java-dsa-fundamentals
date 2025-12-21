// Calculate the power of a Number
// input no.=5
// power p=2 So output=25

import java.util.Scanner;

public class PowerofNum {
    public static void main(String[] args) {
        int result=1;
        System.out.println("Enter the number & power :");
        Scanner obj=new Scanner(System.in);
        int num =obj.nextInt();
        int p =obj.nextInt();
 
         for(int i=1;i<=p;i++)
            {
              result= num*result;
            }
        System.out.println("Result is : "+result);
     }
    
}
