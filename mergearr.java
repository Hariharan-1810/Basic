public class mergearr
{
    public static void main(String[] args)
    {
        int a[] = {10, 40, 50, 80, 90, 100};
        int b[] = {20, 30, 60};

        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;

        int c[] = new int[n + m];

        while (i < n && j < m)
        {
            if (a[i] < b[j])
            {
                c[i + j] = a[i];
                i++;
            }
            else
            {
                c[i + j] = b[j];
                j++;
            }
        }


        if(i == n)
        {
            while(j < m)
            {
                c[i + j] = b[j];
                j++;
            }
        }

        if(j == m)
        {
            while(i < n)
            {
                c[i + j] = a[i];
                i++;
            }
        }

        for(int k = 0; k < n + m; k++)
        {
            System.out.print(c[k] + " ");
        }
    }
}