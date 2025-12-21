 // Number of days in given Month
 import java.util.Scanner;
 public class Month {
    public static void main(String[] args) {
        
        System.out.println("Enter the month : ");
        Scanner obj =new Scanner(System.in);
        int ch = obj.nextInt();

        switch(ch)
        {
            case 1:
            System.out.println("January 31 days");
            break;
            case 2:
            System.out.println("Febuary 28 ");
            break;
            case 3 :
            System.out.println("March 31");
            break ;
            case 4:
            System.out.println("April 30");
            break ;
            case 5:
            System.out.println("May 31 ");
            break ;
            case 6:
            System.out.println("June 30");
            break ;
            case 7:
            System.out.println("July 31");
            break ;
            case 8:
            System.out.println("Aug 31");
            break ;
            case 9:
            System.out.println("Sep 30");
            break ;
            case 10:
            System.out.println("Oct 31");
            break ;
            case 11 :
            System.out.println("Nov 30");
            break;
            case 12 :
            System.out.println("DEc 31");
            break ;

        }
       
        
    }
    
}
