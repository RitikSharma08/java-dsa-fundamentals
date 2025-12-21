  /* String comparision in  java */
public class StringComparisionin  {

    public static void main(String[]args){
        String a="India"; //String literal --isme ascii value se compare hota hai string
        String b="India";

        if(a==b)
        {
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
                   
        //new keyword 
        String c=new String("Bharat");
        String d=new String("Bharat");

        if(c.equals(d))         // In equals method object is compared means the string are stored in heap Bhart is compared.
        {
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
           
    }
    
}
