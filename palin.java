import java.util.*;

public class palin {
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        st.toLowerCase();

        int n = st.length();
        int i=0, j=n-1;

        while(i<j)
        {
            if(st.charAt(i) != st.charAt(j))
            {
                break;
            }
            i++;
            j--;
        }
        if(i<j)
        {
            System.out.println("Not an palindrome");
        }
        else
        {
            System.out.println("Palindrome");
        }
        
    }
}
