// Count number of digits
import java.util.Scanner;
public class CountDigitsNumber {
    public static void main(String[] args) {
    int num,count=0;    
    System.out.println("Enter the numbers :");
    Scanner obj=new Scanner(System.in);    
    num=obj.nextInt();
    
    while(num>0)
    {
     num=num/10;
     count++; 
    }  
    System.out.println("Number of digits in given number is "+count);
    }
    
}
