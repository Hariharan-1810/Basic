import java.util.*;

public class palindrome {
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i,j,k;

        for(i=1;i<=n;i++)
        {
            for(j=(n-i);j>0;j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            k = k - 2;
            while(k>0)
            {
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
