// Programe to print transpose of Matrix.
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr1[][]= new int [3][3];
        System.out.println("Enter the matrix elements :");
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){   //Taking the array elements
                arr1[i][j]=sc.nextInt();
            }

        }
        
        System.out.print("Transpose of Matrix:\n");
          for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){   //Transpose of matrix logic
                System.out.print(" "+arr1[j][i]);
            }
            System.out.print("\n");

        }
       


    }
}
