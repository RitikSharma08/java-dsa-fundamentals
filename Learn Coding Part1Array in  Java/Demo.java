           /*Array in java */
import java.util.Scanner;
public class Demo{
    public static void main(String[]args){
        /*type 1
        int a[]={10,20,30,40,50};
        System.out.println(a[3]);
        */

      /*type2
      int a[]=new int[5];
      a[0]=11;
      a[1]=12;
      a[2]=13;
      a[3]=14;
      a[4]=15;
      for(int i=0 ;i<5;i++)
      System.out.println("Elements in array :"+a[i]);
      */

      /*Type 3 */
      int size,i;
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the size of array :");
      size=obj.nextInt();
      
      int a[]=new int[size];
      System.out.println("Enter the element : ");

      for(i=0;i<size;i++)  // Taking the array element from user
      {
        a[i]=obj.nextInt();
      }
       
      System.out.println("Array element is : ");
      for(i=0;i<size;i++)  // printing the array element
      {
        System.out.println(a[i]+" ");
      } 
    }
}