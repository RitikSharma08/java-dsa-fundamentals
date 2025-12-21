/* to find the length of the Array */

import java.util.Scanner;
public class lengthArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the element : ");
        for(int i=0;i<5;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println(" Array  element :");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nArray length :"+arr.length);
        
    }
    
}
