// Delete the element in array at specific postion
import java.util.Scanner;
public class DeleteElement{
    public static void main(String[]args){
        
        int size,pos,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
         size=sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the array element :");
        for( i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the location :");
        pos=sc.nextInt();

        for(i=pos;i<size-1;i++)  // Deleting the Element in array.
        {
           arr[i]=arr[i+1];
        }
        size--;
        System.out.println("Array Elements");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
