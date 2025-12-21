  // Learning About constructor overloading 
    class C {
    int a ; double b;String c;
    C()
    {
        a=12; b=45.23;c ="raj";
        System.out.println(a+" "+b+" "+c);
    }

    C(int x)
    {
        a=x;

    }
    
    C(double y, String z)
    {
           b=y; c=z;

    }
}

    class CO{
    public static void main(String[]args){
        C r1=new C();
        C r2 =new C(15);
        C r3= new C(25.15,"Rahul");

         System.out.println(r1.a+" "+r1.b+" "+r1.c);
          System.out.println(r2.a);
           System.out.println(r3.b+" "+r3.c);
    }
}
