   /*Vowel oe consonats in Java
    * input a ,e , i ,o ,u --->Vowel
    input b c d etc... ---->Consonats
    */ 
    import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class VowelorConstant {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the character :");
        Scanner obj =new Scanner(System.in);
        ch =obj.next().charAt(0);

        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        System.out.println(" Character is Vowels");
        else 
        System.out.println(" Character is Consonats");
    }
    
}
