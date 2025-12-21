/* Programe to print Mirror Matrix
  10 20   is  20 10
  30 40       40 30

*/ 
import java.util.Scanner;
public class MirrorMatrix {
    public static void main(String[]args){
     
        int arr1[][] = new int [3][3];
        System.out.println("Enter the array elements : ");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0; j<arr1.length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Mirror Matix is : ");
         for(int i=0;i<3;i++)
        {
            for(int j=2; j>=0;j--){
                System.out.print(" "+arr1[i][j]);
                
            }
            System.out.print("\n");
        }


    }
    
}
