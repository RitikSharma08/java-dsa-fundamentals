// Diamond pattern by user
import java.util.Scanner;
public class patternDiamonduser {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner sc= new Scanner(System.in);
        int row =sc.nextInt();
        int n=(row+1)/2;
        int k=0;
        for(int i=1;i<=7;i++)
        {  
           if(row%2==0)
           { if(i<=n)
             k++;
             if(i>n+1)
             k--;
           }
             else
            { if(i<=n)
                {
                    k++;
                }
                else{
                    k--;
                }
            }
        for(int j=1;j<=7;j++)
            {
                if(j>=5-k && j<=3+k)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
