   /* Relational Oprator example */
   import java.util.Scanner;
   public class Relational {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the two numbers a & b :");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("a is smaller than b :"+(a<b));
        System.out.println("a is greater than b:"+(a>b));
        System.out.println("a is smaller & equal to b :"+(a<=b));
        System.out.println("a is greater & equal to b :"+(a>=b));
        System.out.println("a is equal to b :"+(a==b));
        System.out.println("a is not equal to b :"+(a!=b));
    } 
}
