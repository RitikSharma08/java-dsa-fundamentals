 // Print the natural number
  import java.util.Scanner;
public class Naturalnum {
    public static void main(String[] args) {
        int n ,i;
        System.out.println("Enter the number of term : ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        System.out.println("natural numbers :");
        for(i=1;i<=n;i++)
        {
            System.out.print(" "+i);
        }

    }
    
}
