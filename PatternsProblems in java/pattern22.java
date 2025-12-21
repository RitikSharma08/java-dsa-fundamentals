
public class pattern22 {
    public static void main(String[]args)
    {
        char k;
        int i;
        for( i=1;i<=4;i++)
        {
            k=49;
            for(int j=1;j<=8;j++)
            {
                if(j>=5-i&&j<=4+i)
                {
                   
                System.out.print(""+k);
                k++;
                if(j==4)
                {
                    k=65;
                }
                }
                else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
    


    

