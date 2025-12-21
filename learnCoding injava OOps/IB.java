   /* Instance-Block */
 class LearnInstanceblock {
    
   int a,b;

   void show()   // method
   { 
    a=50;b=60;
    System.out.println(a+" "+b);

   }

   LearnInstanceblock()   // constructor
   {
     a=30;b=30;
     System.out.println(a+" "+b);
   }
   
   {
         a=10; b=20;    // instance block
         System.out.println(a+" "+b);
    }
}

class IB{
    public static void main(String[]args){
        LearnInstanceblock ref=new LearnInstanceblock();
        ref.show();
   
    }
}
