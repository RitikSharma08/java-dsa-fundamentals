/*  Multi -level Inheritance */

class MultilevelInheritance  // Superclass
{
    
    int a,b,c,d;
    void sumAndDiff(){
        a=10;b=20;
        c=a+b;
        d=a-b;
        System.out.println("Addition is : "+c);
        System.out.println("Subtraction is : "+d);
    }
}
class B extends MultilevelInheritance  //sub-class1
{
   void Multi()
   {
    a=70;b=40;
    c=a*b;
    System.out.println("Multip;ication is : "+c);
   }

   void div()
   {
    a=20;b=4;
    c=a/b;
    System.out.println("Division  is : "+c);
   }
}

class MultiLIn extends B //sub-class2
{
    void rem()
    {
        a=100;b=9;
        double rem;
        rem=a%b;
        System.out.println("Remainder is : "+rem);
    }

    public static void main(String[] args) {
        MultiLIn ref=new MultiLIn();
        ref.sumAndDiff();
        ref.Multi();
        ref.div();
        ref.rem();
    }

}
