import java.util.*;

public class rec
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();

        for(int i=0;i<l;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(i==0 || i==(l-1) || j==0 || j==(b-1))
                {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
