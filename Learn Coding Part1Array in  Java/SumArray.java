// Find the sum of arry ELEMENT
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        int i;
        int arr1[]= new int[5];
        System.out.println("Enter the elements of Array1 : ");
        Scanner obj= new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            arr1[i]=obj.nextInt();
        }
        int arr2[]= new int[5];
        System.out.println("Enter the element of Array2 :");
        for(i=0;i<5;i++)
        {
            arr2[i]=obj.nextInt();
        }

        int arr3[]=new int[5];
        System.out.println("Sum of two Array is");
        for(i=0;i<5;i++){
        arr3[i]=arr1[i]+arr2[i];
        System.out.println(arr3[i]);
        }
    }
    
}
