/*                 *
 *                * *
                 * * *
                * * * * 
               * * * * *
 */
public class pa6 {
    public static void main(String[]args)
    {   boolean m;
        int k=(int)m;
        int i,j;
        for( i=1;i<=5;i++)
        {
            int k=1;
            for(j=1;j<=9;j++)
            {
                if(j>=6-i && j<=4+i && k)
                {
                System.out.print("*");
                 k=0;
                }
                else{
                System.out.println(" ");
                 k=1;    
            }
            }
            System.out.print("\n");
        }
    }
}
