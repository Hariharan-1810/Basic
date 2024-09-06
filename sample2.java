import java.util.*;

public class sample2 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i,j,k;
        int x = 1;

        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n-1;j++)
            {
                System.out.print(" ");
            }

            for(k=1;k<=i;k++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
