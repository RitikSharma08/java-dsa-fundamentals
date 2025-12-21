           /* abstract method program */

abstract class Programming{
    public abstract void Developer();

}

class HTML extends Programming
{
    @Override
    public void Developer (){
        System.out.println("John Berners lee html founder");
    }
}
 class Java extends Programming
 {
    @Override
    public void Developer(){
        System.out.println("james Gosling");
    }
 }
 //main fuction
class Amp {
    public static void main(String[]args){
        HTML h =new HTML();
        h.Developer();
        Java j=new Java();
        j.Developer();

    }
  
    
}
