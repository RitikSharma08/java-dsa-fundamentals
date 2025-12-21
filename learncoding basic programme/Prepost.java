 /* Increment/decrement operator */
public class Prepost {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Prepost increment :");
        System.out.println(a++); //10 //11
        System.out.println(++a);  //12 
       
        System.out.println("Prepost decrement :");
        System.out.println(a--); //12  11
        System.out.println(--a);  // 10
    } 
}
