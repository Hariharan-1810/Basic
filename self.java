import java.util.*;

public class self
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
        }

        int l[] = new int[n];
        int r[] = new int[n];
        int res[] = new int[n];

        l[0] = 1;
        r[n-1] = 1;

        for(int i=1; i<n; i++)
        {
            l[i] = l[i-1]*a[i-1];
        }

        for(int i=n-2; i>=0; i--)
        {
            r[i] = r[i+1]*a[i+1];
        }
        
        for(int i=0; i<n; i++)
        {
            res[i] = l[i] * r[i];
            System.out.print(res[i]+" ");
        }
    }
}