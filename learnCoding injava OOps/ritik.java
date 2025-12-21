        /*SIMPLE/SINGLE Inheritance */

 class student  //super
{           
  int roll ,marks;
  String name;

  void input()
  {
    System.out.println("Enter roll name & marks :");
  }
    
}

class ritik extends student  //Sub-class
{
   void disp()
   {
    roll=136; marks=95;name="Ritik Sharma";
     System.out.println(roll+" "+name+" "+marks);
   
   }

   public static void main(String[]args)
   {
    ritik ref=new ritik();
    ref.input();
    ref.disp();
   }
}
