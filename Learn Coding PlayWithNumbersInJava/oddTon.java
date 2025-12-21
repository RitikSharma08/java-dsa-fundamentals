  /* Print the odd number in the given Range */
  import java.util.Scanner;
public class oddTon 
{
    public static void main(String[] args) 
    {
    System.out.println("Enter the range of number");
    Scanner obj =new Scanner(System.in);
    int num = obj.nextInt();

    System.out.println("Odd numbers of range" + num + "is " );
    for(int i=1 ;i<=num;i++)
      {
      int  odd =2*i-1;
      num--;
      System.out.println(odd+" ");
      }
    }
}
