  /* toString() aslist() deepToString  */
  import java.util.Arrays;  // importing the array class and its function
public class Arraymethods {
  public static void main(String[] args) {
    String a[]={"learn","coding","Keypoints","Education"};
    System.out.println("toString() "+Arrays.toString(a));
    System.out.println("asList()"+Arrays.asList(a));

    int arr[][]={ {10,20},{30,40},{50,60}};
    System.out.println("deeptoString()"+Arrays.deepToString(arr));

  }
    
}
