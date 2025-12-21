                // Recursion in java
                // Sum of N natural number
public class Recursion {
    public static void main(String[]args){
       Recursion r= new Recursion();
       int a = r.sum(10); //calling
       System.out.println("Sum of n natural number is : "+a);

    }
    
    int sum(int b)
    {
        if(b>0)
        {                            //calling
           return b+sum(b-1);   
        }
        else{
             return 0;
        }
       
    }
}
