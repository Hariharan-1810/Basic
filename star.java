import java.util.*;

public class star
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m;

        for(int i=0;i<n;i++)
        {
            m = i+1;
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--)
            {
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
