// sort the array the elements in decsending order
import java.util.Scanner;
public class descending{  
    public static void main(String[]args){
    System.out.println("Enter the size of Array :");
    Scanner obj= new Scanner(System.in);
    int temp;
    int size=obj.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements in Array :");
    for(int i=0;i<size;i++)  // Taking the array element from user
    {
        arr[i]=obj.nextInt();
    }
      
    for(int i=0;i<size;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if(arr[i]<arr[j]) //Sorting the elements in decending order
            {
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;  
            }
            
        }
    }
      //For printing the element  in decending order
      System.out.println("Descending order of array element :");
      for(int i=0;i<size;i++)
      {
        System.out.print(" "+arr[i]);
      }
    }
    
}
