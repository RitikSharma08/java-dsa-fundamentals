/*  Copy Array elements */
// first a[]=10 20 30 40------->second b[]=10 20 30 40
import java.util.Scanner;
public class Copyarray {
    public static void main(String []args){
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter value in first Array");
        for(int i=0;i<5;i++)
        {
         arr1[i]=obj.nextInt();
        }
        
        System.out.println("Copied element in second Array :");
        for(int i=0;i<5;i++)
        { arr2[i]=arr1[i];
            System.out.println(arr2[i]);
        }
    }
    
}
