/* copyOf() --Array's Mehods
 * It is array class ke predefined static methods hai.
 * for that function we have to import arrays class.
 * for the calling not requiesd an object ,It is directly access by Arrays of class.
 */
import java.util.Scanner;
import java.util.Arrays;
public class copyofmethod {
    public static void main(String[]args)
    {
        int arr1[]=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in array1 : ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=Arrays.copyOf(arr1,5);
        System.out.println("Data in array2 :");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
    
}
