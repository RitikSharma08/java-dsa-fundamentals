// program to understand How to use method in java
import java.util.Scanner;
public class fun {
    int a,b,add,sub,multi,rem;
    float div;
    public static void main(String[] args) {
        fun r=new fun();
        r.input();
        r.process();
        r.dispaly();  
        
    }
    void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value a & b : ");
        a= sc.nextInt();
        b=sc.nextInt();
    }
    void process()
    {
        add=a+b;
        sub=a-b;
        multi=a*b;
        div=a/b;
        rem=a%b;
    }
    void dispaly(){
        System.out.println("Addition : "+add);
        System.out.println("Subtraction :"+sub);
        System.out.println("Multiplication : "+multi);
        System.out.println("Division : "+div);
        System.out.println("Remainder : "+rem);

    }
}
