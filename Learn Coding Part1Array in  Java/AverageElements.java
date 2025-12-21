//   Find the average of Array elements  

import java.util.Scanner;
public class AverageElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enet the size of Array");
        int size=sc.nextInt();
        int sum=0;double avg=0;
        int arr[]=new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println("Average of elements : "+avg);
    }

    
}
