import java.util.*;

public class strrev {

    public static void check(String s)
    {
        String st[] = s.split(" ");
        int n = st.length;

        for(int i=n-1;i>=0;i--)
        {
            System.out.print(st[i]+" ");
        }
    }

    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        String st = s.nextLine();
        check(st);
    }
}
