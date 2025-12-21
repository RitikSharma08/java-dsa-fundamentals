           /* compare Arrays */
// Two methods exits
// 1. ==  ----> check variable refence name not array elements.
// 2. equals() ---> Check only Arrays elements.
import java.util.Arrays;
 public class compare {
    public static void main(String[]args)
    {
        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40,50};

        if(Arrays.equals(a,b)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
    
}
