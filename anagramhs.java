import java.util.*;
public class anagramhs
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();

        int n = a.length();
        int m = b.length();

        if(n != m)
        {
            System.out.println("not anagram");
        }
        else
        {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < n; i++)
            {
                char c = a.charAt(i);
                if (map.containsKey(c))
                {
                    map.put(c, map.get(c) + 1);
                }
                else
                {
                    map.put(c, 1);
                }
            }

            for(int i=0; i < m; i++)
            {
                char c = b.charAt(i);
                if (map.containsKey(c))
                {
                    if(map.get(c) == 1)
                    {
                        map.remove(c);
                    }
                    else
                    {
                        map.put(c, map.get(c) - 1);
                    }
                }
                else
                {
                    System.out.println("not anagram");
                }
            }
            System.out.println(map.isEmpty());
        }
        s.close();
    }
}
