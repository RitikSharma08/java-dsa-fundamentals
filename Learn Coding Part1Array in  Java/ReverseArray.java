/*  Print the Array element in reverse order  
 * inputa[5]=10 20 30 40 ----->40 30 20 10
 * */
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[]aregs){
        int size,i;
        System.out.println("Enter the size of Array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println(" enter the element :");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements : ");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Reverse order of Array element :");
        for(i=1;i<=size;i++)
        {
            System.out.println(arr[size-i]);
        }
    }
    
}
