import java.util.Scanner;

public class sample
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int n = 1;
        
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }

    }
}
