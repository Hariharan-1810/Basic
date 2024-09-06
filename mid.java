public class mid
{

    public static void find(int[] arr, int n)
    {
        if (n == 0)
        {
            return;
        }
        else
        {
            int m = n /2;
            for(int i=0; i<n/2; i++)
            {
                System.out.print(arr[i] + " " + arr[i+m] + " ");
            }
            if(n%2 !=  0)
            {
                System.out.print(arr[n-1]);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;;

        find(arr, n);
    }
}
