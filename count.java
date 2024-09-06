import java.util.*;

public class count {

    public static int find(int arr[], int m,int y)
    {
        int num = 0;
        for(int i=0;i<m;i++)
        {
            if(arr[i] == y)
            {
                num++;
            }
        }

        return num;
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
        int x = s.nextInt();

        int num = find(a,n,x);

        if(num == 0)
        {
            System.out.println("The Given number is not in array");
        }
        else
        {
            System.out.println("The Given number is occured : "+num+" times");
        }
    }    
}
