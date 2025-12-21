              // Java Variable
class Trial
{
    int a=100; //Instance /global variable 
    static int b=200; //static variable
    public static void main(String[] args) {
        int c =300; //local variable
        final int D=400; //final variable
        Trial t=new Trial(); //object creation

        System.out.println(t.a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(D);

    }
}