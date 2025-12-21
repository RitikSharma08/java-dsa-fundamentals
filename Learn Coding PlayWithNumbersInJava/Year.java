// To Find the year is leap year or not
// 1. century (100%=0 and 400%=0) is leap 

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Year {
    public static void main(String[] args) {
        System.out.println("Enter the year :");
        Scanner obj =new Scanner(System.in);
        int yr =obj.nextInt();

        if(yr%100==0 && yr%400==0 || yr%100!=0 && yr%4==0)
        {
            
            System.out.println("It is a leap year");
        }
        else 
        System.out.println("Not a leap year");
    }
    
}
