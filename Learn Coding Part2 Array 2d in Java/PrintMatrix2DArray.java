// To print the 2D matrix in output Screen
import java.util.Scanner;
 class PrintMatrix2DArray{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[][]= new int[2][2];
        System.out.println("Enetr the matrix elements");
      
        for(int i=0;i<arr.length;i++)  // rows
        {
            for(int j=0;j<arr.length;j++)  //columns
            {
              arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix Elements is :");
          for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
                  System.out.print("\n");
            
        }
      
        
    }
}