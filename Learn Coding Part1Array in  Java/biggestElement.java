//  Find the biggest element in given array.
import java.util.Scanner;
public class biggestElement {
    public static void main(String[]args){
        
        int size,max,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
         size=sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the array element :");
        for( i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         
         max=arr[0];
        for( i=1; i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        
        System.out.println("Biggest element : "+max);
        

       /* //  by using the sort method to find big element
         Arrays.sort(arr);
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
        int bigElement =arr[arr.length-1];
        System.out.println("Big boss "+bigElement);
       
        */

    }
    
}
