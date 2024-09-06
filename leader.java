import java.util.*;

public class leader {

    public static void lead(int arr[],int m)
    {
        if(arr[0] > arr[1])
        {
            System.out.print(arr[0]+" ");
        }

        for(int i=1;i<m-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                System.out.print(arr[i]+" ");
            }
        }
        if(arr[m-1] > arr[m-2])
        {
            System.out.print(arr[m-1]+" ");
        }
    }

    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }

        lead(a,n);
    }
}