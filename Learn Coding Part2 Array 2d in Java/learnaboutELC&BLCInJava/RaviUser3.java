// the ElC

public class RaviUser3 {
    public static void main(String[] args) {
       
        int n=20,m=10,rem;
        rem=n%m;
        System.out.println("Remainder toh dekhlo :"+rem);
         

        Amazon r= new Amazon(); //Creating the object of Bussiness class
        r.input();  // calling the function
        r.show();

        flipkart r2 =new flipkart();
        r2.input();
        r2.show();
  
  
    }

    
}
