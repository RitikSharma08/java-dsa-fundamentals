import java.util.Scanner;
public class SumOf2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i ;
        int j=0;
       int arr1[][] = new int[2][2]; 
       int  arr2[][] = new int[2][2];
       int arrsum[][] = new int[2][2];
        System.out.println("Enter the Marix 1 elements");
        for( i=0;i<arr1.length;i++)
        {
            for( j=0; j<arr1.length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

          System.out.println("Enter the Marix 2 elements");
        for( i=0;i<arr2.length;i++)
        {
            for( j=0; j<arr2.length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

      
        System.out.println("Sum of the 2 Matrix is :");
          
         for( i=0;i<arrsum.length;i++)
        {
            for( j=0; j<arrsum.length;j++)
            {
                arrsum[i][j]= arr1[i][j]+arr2[i][j];
                System.out.print(" "+arrsum[i][j]);
            }
            System.out.print("\n");
        }

    }
    
}
