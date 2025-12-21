                // Tax calculation program
/* input salary <=10000 ------>No tax
 * input salary >10000 between salary<100000 ---> 10% Tax
 * input salary >100000 ----> 20% Tax 
*/
 import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        System.out.println("enter the salary : ");
        Scanner obj =new Scanner (System.in);
        int salary = obj.nextInt();

        if(salary<=10000)
        {
            System.out.println("No Need to pay the tax");
        }
        else if(salary >10000 && salary<=100000)
        {
            int taxpay = (salary * 10)/100;
         System.out.println("Tax to pay of " +salary+ " salary is :"+taxpay ); 
            int rem_sal=salary-taxpay;
            System.out.println("Remaining  salary is " + rem_sal);
        }
        else 
        {
            int taxpay =( salary * 20)/100;
          System.out.println("Tax to pay of " +salary+ " salary is :"+taxpay );
          int rem_sal=salary-taxpay;
          System.out.println("Remaining  salary is " + rem_sal);
            
        }
    }
    
}
