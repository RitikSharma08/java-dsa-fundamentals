 /* Copy  Constructor 
  * In this program we are copy the constructor and display by passing of refernce variable to another.
 */

 
 class A{

    int a ;String b;  //instance variable
    A() 
    {
        a=50; b="Ritik Sharma";
        System.out.println(a+" "+b);
        System.out.println();

    }

    A(A ref)               // Copy constructor
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
        System.out.println("Hello jii");
    }


 }

 class B{
    public static void main(String[] args) {
        A r1=new A();
        A r2=new A(r1);
    }
 }