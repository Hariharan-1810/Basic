import java.util.*;
public class anagram
{

    public static boolean find(char[] a1, char[] a2)
    {
        int n = a1.length;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < n; i++)
        {
            if(map.containsKey(a1[i]))
            {
                map.put(a1[i], map.get(a1[i]) + 1);
            }
            else
            {
                map.put(a1[i], 1);
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (map.containsKey(a2[i]) && map.get(a2[i]) > 0)
            {
                map.put(a2[i], map.get(a2[i]) - 1);
            }
            else
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() != s2.length())
        {
            System.out.println("not anagram");
        }
        else
        {
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            
            System.out.println(find(a1, a2));
        }
        sc.close();
    }
}