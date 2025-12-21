// programe to learn various string method in java .
public class StringMethods {
    public static void main(String args[])
    {
        String a="RITIK";
        String b="sharma";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a)); // Two strings ko combine karta hai.
        System.out.println(b.length()); // Length of string bata hai.

        String c="  Ankush   ";
        String d="";
        System.out.println(c);
        System.out.println(c.trim());  // Extra space ko hata deta hai.
        System.out.println(d.isEmpty()); //Khali hota hai true print hoga otherwise false.
       
        System.out.println(b.charAt(2)); // for print the character with index number.
        System.out.println(a.indexOf('K')); //For print the index number with the Character.
         
        System.out.println(b.equals(a));
        System.out.println(b.replace('m','t'));

    }
}
