import java.util.*;

public class firstuniqueue
{
    static String ans;
    public static int find(String s)
    {
        for(int i=0; i<s.length(); i++)
        {
            ans = s.substring(0, i) + s.substring(i+1);

            if(ans.indexOf(s.charAt(i)) == -1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        System.out.println(find(a));
    }
}
