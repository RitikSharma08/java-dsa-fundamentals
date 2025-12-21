// print the even numbers ingiven range
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        int range;
        System.out.println("Enter the range : ");
        Scanner obj = new Scanner(System.in);
        range =obj.nextInt();
        
    System.out.println("Even numbers in Range "+range+" is");
        for(int i=1;i<range;i++)
        { 
            System.out.print(" "+(i*2));
            range--;
        }

    }
    
}
