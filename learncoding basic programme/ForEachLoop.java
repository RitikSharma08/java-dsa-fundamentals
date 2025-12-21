 /* For each loop ----> It is mainly used to fetch the value
  * from a collection like Array
  */

public class ForEachLoop {
    public static void main(String[] args)
     {
      int a[]={10,20,30,40,50,60} ;
      int i;
 /*This is *for each* loop where variable b is fetch the 1st index
 value or print and continously fetch the value of others elements 
 in array */
         for(int b :a) //for each loop
        {
            System.out.println(b+" ");
        }
         for( i=0;i<=a.length;i++)
        {
          System.out.println("Array elements: "+a[i]);
        }
    } 
}
