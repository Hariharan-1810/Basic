import java.util.*;

public class even {

    public static void find(int arr[], int m)
    {
        int cnt = 0;
        for(int i=0;i<m;i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.print(arr[i]+" ");
                cnt++;
            }
        }
        if(cnt == 0)
        {
            System.out.println("none of the element in the is even");
        }
    }

    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a[] = new int[5];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }

        find(a,n);
    }    
}
