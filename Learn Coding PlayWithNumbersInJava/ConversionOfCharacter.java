// Convert Uppercase to lowercase character and vice-versa
// Input a - z ------> Upeercase
// Input A - Z --------> Lowercase 
import java.util.Scanner;
public class ConversionOfCharacter {
    public static void main(String[] args) {
        char ch2;
        System.out.println("Enter the character :");
        Scanner obj=new Scanner(System.in);
        char ch =obj.next().charAt(0);
      
        if(ch>='A'&&ch<='Z')
        {
          ch2=Character.toLowerCase(ch);
          System.out.println("Lowercase : "+ch2);
        }
        else 
        {
            ch2=Character.toUpperCase(ch);
            System.out.println(" Uppercase  : "+ch2);
        }
    } 
}
