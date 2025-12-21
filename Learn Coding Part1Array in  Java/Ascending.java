// Sort the Array  elements in ascending order
import java.util.Scanner;
public class Ascending {
    public static void main(String[] args) 
    {
        int size,i,temp;
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the size of array :");
      size=obj.nextInt();
      
      int a[]=new int[size];
      System.out.println("Enter the element : ");

      for(i=0;i<size;i++)  // Taking the array element from user
      {
        a[i]=obj.nextInt();
      }
       

       for(i=0;i<size;i++)
       { 
          for(int j=i+1;j<size;j++)
         {
            if(a[i]>a[j])
            {
                temp=a[i];    //Swapping
                a[i]=a[j];
                a[j]=temp;
            }
         }
       }
       
       for(i=0;i<size;i++)
       System.out.println("Array elements in Ascending order :"+a[i]);
    }
    
}
