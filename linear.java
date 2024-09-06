import java.util.*;

public class linear {

    public static int linearsearch(int arr[],int num,int val)
    {
        for(int i=0;i<num;i++)
        {
            if(arr[i] == val)
            {
                return i+1;
            }
        }
        return -1;
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

        int rst = linearsearch(a,n,x);

        if(rst == -1)
        {
            System.out.println("The element is not found in the array");
        }
        else
        {
            System.out.println("The element is found in : "+rst+" position");
        }
    }
}
