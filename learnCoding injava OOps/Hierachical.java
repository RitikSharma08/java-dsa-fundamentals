  /* Hierarchical Inheritance */

  class A{
    void input()
    {
        System.out.println("Enter youer name : ");

    }
  }
  class B extends A
  {
    void show()
    {
        System.out.println("My nmae is Ritik");

    }
  }

  class C extends A {
    void Disp()
    {
        System.out.println("Tiger name toh sunna hoga");
    }
  }
public class Hierachical {
    public static void main(String[]args)
    {
        B r=new B();
        C r2=new C();

        r.input();
        r.show();

        r2.input();
        r2.Disp();
    }
    
}
