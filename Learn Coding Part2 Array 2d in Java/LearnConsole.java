/*                 Console Class in java
  * readLlne(),readPassword() dono console class ke method hai.
  * Jiso console class ke object ke through access kiya ja sakta hai. 
 */

//import java.io.*;          
import java.io.Console;

public class LearnConsole {
    public static void main(String[]args)
    {
        String str1;
        char ch[];
        Console obj=System.console();
        System.out.println("Enter your name :");
        str1=obj.readLine();

        System.out.println("Password is : ");
        ch=obj.readPassword();

        String a=String.valueOf(ch); // use to seen the password
        System.out.println("User name is  :" +str1);
        System.out.println("Password is :"+ch);

        System.out.println("chale dekh le password : "+a);
    }
    
}
