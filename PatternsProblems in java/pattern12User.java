
import java.util.Scanner;
public class pattern12User {
    public static void main(String[]args)
    {   
        System.out.println("Enter the no  of rows");
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=(rows*2)-1;j++)
            {
                if(j>=i&&j<=(rows*2)-i)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    
    }
}
