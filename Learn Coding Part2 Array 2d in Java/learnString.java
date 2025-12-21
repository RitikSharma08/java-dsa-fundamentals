//  String in java 

public class learnString {
    public static void main(String[] args) {
        // String Literal
        String a="Ritik";  // literals
        System.out.println(a);

        String b="Ritik";    // literals
        System.out.println(b);

        a=a.concat(" Sharma");
        System.out.println(a);

        //New keyword
        String c=new String("Ravi");
        System.out.println(c);

        String d= new String("Ravi");
        System.out.println(d);

        c.concat("Baraskar");
        System.out.println(c);
        
        c=c.concat("Baraskar");
        System.out.println(c);
    }
    
}
