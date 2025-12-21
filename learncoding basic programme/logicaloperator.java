    /*logical opearator example */
public class logicaloperator {
    public static void main(String[] args) {
        System.out.println("Logical And");
        System.out.println((10>5)&&(2>1)); //true
        System.out.println((10>5)&&(2<1));  //false
        System.out.println((10<5)&&(2<1));  //false

        System.out.println("Logical Or");
        System.out.println((10>5) || (2>1));   //true
        System.out.println((10>5) || (2<1));    //true
        System.out.println((10<5) || (2<1));   //false
        
        System.out.println("Logical Not");
        System.out.println(!(10>5));
        System.out.println(!(10<5));  
    }
    
}
