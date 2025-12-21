public class Variablecall {
 static int a =10;// static variable
    void fun()
    {
        int b=10; //local variable
        System.out.println(a+" "+b); // 11  10
        ++a;
        ++b;
    }
    public static void main(String[] args) {
     Variablecall ref=new  Variablecall(); //object creation 
     ref.fun();  // calling the fun function
     ref.fun();
    }
}
