/*  Insert the item in Array 
 * At specific position in Array
*/
import java.util.Scanner;
public class InsertElement {
    public static void main (String[]args){
        int size ,pos,item,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        size=sc.nextInt();
        int arr[]=new int [size+1];
        System.out.println("Enter the element of the Array :");
        for( i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position & element in Array");
        pos=sc.nextInt();
        item=sc.nextInt();

        for(i=size;i>pos;i--) // for emptying the array position 
        {
          arr[i]=arr[i-1];
        }

        arr[pos]=item;        // inserting the item at specific position 
        size++;

         for( i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
