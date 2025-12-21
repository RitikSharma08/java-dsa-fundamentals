                                 /* Static vs Non Static  */
public class StaticVSNonStatic {
  int a=10;
  static int  b=20;
    public static void main(String[] args) {
        
        StaticVSNonStatic r=new StaticVSNonStatic();
        r.Display();

        StaticVSNonStatic.Show();
    }
    static void Show(){          //Static function me sirf static variabke access hota hai.
      System.out.println(" "+b);
    }

    void Display()   //Non -static function me staic or non staic variable access hota hai.
    {
         System.out.println(a+" "+b);
    }
}
