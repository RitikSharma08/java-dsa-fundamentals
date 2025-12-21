  /*    learn about the Static Block */

public class SB {
    
    static{      // static block
                // static block  only acess the static variable.
        System.out.println("Learn coding");
    }
     
      {   // Instance block 
          // Instance block only acess by object
          //Instance block can acess the staic or non-static variable.
        System.out.println("Ritik Sharma");
      }

      SB()
      {
        System.out.println("Filpkart me jana hai.");
      }

     
      public static void main(String[] args) {
        SB r =new SB();
      }
    
}
