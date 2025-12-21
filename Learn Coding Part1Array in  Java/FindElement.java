    /* Search the Array element  (linear search)
     * Example a[]={10,20,30,40,50,60} 
     * Search item 70 ----->item not found*/
import java.util.Scanner;
public class FindElement 
{
    public static void main(String[]args)
    {
        int i,size,key,count=0,pos=0 ;
        System.out.println("Enter the size of aray :");
        Scanner sc= new Scanner(System.in);
        size=sc.nextInt();
        
        int arr[]=new int[size];
        System.out.println("enter the elements :");
        for( i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements :");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the seraching element :");
        key=sc.nextInt();
    
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==key){
                count++;
                pos=i;
            }
        }
        if(count>0)
         System.out.println("Element is foumd at postion : "+ pos);
        else
         System.out.println("Element is not found ");    
   
   }
}
