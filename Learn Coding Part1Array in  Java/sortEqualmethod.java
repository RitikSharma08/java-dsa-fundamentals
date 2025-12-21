/*Sort() Equal() 
 * It is array class ke predefined static methods hai.
*/
import java.util.Scanner;
import java.util.Arrays;
public class sortEqualmethod {
    public static void main(String[] args) {
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array1 element: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
           /*  Arrays.sort(a); //using sort function
            for(int i=0;i<a.length;i++) 
            {
                System.out.println(a[i]+" ");
            }
             */
             
             System.out.println("Enter the array2 element: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

       boolean d=Arrays.equals(arr1,arr2);//here it is equal() mehod which are avaiable i
       //n arrays Class
       //using to compare theequal size and same element in two different Array.
       
       System.out.println("Both the array elements are same hai kya : "+d);

    }
    
}
