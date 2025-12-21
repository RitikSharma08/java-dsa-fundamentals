// Revesre the String in java.
public class ReverseTheString {
    public static void main(String[]args){
     
        // method -1  by StringBuffer
     StringBuffer r=new StringBuffer("Learn Coding");
     System.out.println(r.reverse());

     // method -2 by StringBuilder
     StringBuilder ref= new StringBuilder("Jai Ho");
     System.out.println(ref.reverse());

     // method -3 By Own Logic
     int l;
     String str1="Ready to learn Java";
     String str2="";
     l=str1.length();
    

     for(int i=l-1;i>=0;i--)
     {
        str2=str2+str1.charAt(i);
     }
     System.out.println(str2);

    }
    
}
