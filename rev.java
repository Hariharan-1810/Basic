import java.util.*;

class rev
{
    public static void main(String []args)
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = 0;
        int b = n;
        int sum = 0;

        while(n>0)
        {
            a = a * 10;
            a = a + (n % 10);
            n = n / 10;
            sum++;
        }

        System.out.println('\n' + "Given Number : "+ b );
        System.out.println("Reversed Number : " + a);
        System.out.println("No. of. Digits : " + sum);

        if(a == b)
        {
            System.out.println("Given Number is an Palindrome" + '\n');
        }
        else
        {
            System.out.println("Given Number is not an Palindrome" + '\n');
        }
    }
}

