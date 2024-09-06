import java.util.*;

public class big {

    public static int find(int arr[], int m)
    {
        int max = 0;
        for(int i=0;i<m;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
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

        int num = find(a,n);

        System.out.println("Biggest number in the given array is : "+num);
    }    
}
