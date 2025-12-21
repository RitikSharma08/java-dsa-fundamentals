//  Find the smallest element in given array.
import java.util.Scanner;
public class smallestElement
 {
    public static void main(String[]args){
        
        int size,min,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
         size=sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the array element :");
        for( i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         
         min=arr[0];
        for( i=1; i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }

        }
        
        System.out.println("Smallest element : "+min);
    } 
} 

     

