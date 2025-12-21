/*  *
 *  * *
 *  * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 */
import java.util.Scanner;
public class pattern11user {
    public static void main(String[]args)
    {
        int k=0,rows;
        System.out.println("Enter the rows number :");
        Scanner sc=new Scanner(System.in);
        rows =sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
             if(i<=(rows+1)/2)
                k++;
             else
                k--;
            
            for(int j=1;j<=(rows+1)/2;j++)
            {  
                 if( j<=k)
                System.out.print("*");
                else
                System.out.print(" ");
            }
               System.out.print("\n");
        }
            
    }
}
    


    

