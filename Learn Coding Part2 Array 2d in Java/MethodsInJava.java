/* Java Method Program
 * point to remember 
 * 1. For the calling of method we have create a objct of class and 
 * with the help of reference variable we can Call the method.
 * 
 * 2.When be create a static method we not have to create object of class 
 * for calling that method.We can directly call by the class name.
 */
public class MethodsInJava{
   public static void main(String[] args){
   
    System.out.println("This is the main function");

    MethodsInJava r= new MethodsInJava();  // object cereation 
    r.display();                            // reference calling
   
    MethodsInJava.show();// here show is static method so it can directly call by the classname .
   }
   void display()
   {
     System.out.println("This is the display function ");
   }
    
   static void show(){
    System.out.println("Show method");
   }
    
}
