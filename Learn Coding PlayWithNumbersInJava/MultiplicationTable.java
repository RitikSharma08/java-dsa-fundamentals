// print the multiplicationtable
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
    System.out.println("Enter the number : ");
    Scanner obj=new Scanner(System.in);
    int num =obj.nextInt();
    
    System.out.println("Table of given number is :"); 

    for(int i=1;i<=10;i++)
    {
        System.out.println(" "+num+" * " +i+ " = "+num*i+" ");
    }
    }
    
}
