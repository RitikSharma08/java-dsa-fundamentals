   /* Learn about the Private Constructor  */

public class LearnPrivate { 
    int a;double b; String c;

    private LearnPrivate()
    {
        a=10;b=12.34;c="Ritik";
        System.out.println(a+"  "+b+"  "+c);

    }
    static void show()
    {
           //System.out.println(a); //you cannot acess the variable of private method     
        System.out.println("My name is Ritik ");
    }
    
    public static void main(String[] args) {
        LearnPrivate ref =new LearnPrivate();
        show();
    }
    
}
