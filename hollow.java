import java.util.*;

public class hollow {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n-1;j++)
            {
                System.out.print(" ");
            }

            for(k=1;k<=i;k++)
            {
                if(i==n && k!=n)
                {
                    System.out.print("**");
                }
                else if(i==n && k==n)
                {
                    System.out.print("*");
                }
                else
                {
                    if(k==1 || k==i)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}

