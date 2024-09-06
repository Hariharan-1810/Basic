import java.util.*;
public class ransom
{

    public static boolean find(String a, String b)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if(a.length() > b.length())
        {
            return false;
        }
        else
        {
            for (int i = 0; i < b.length(); i++)
            {
                char c = b.charAt(i);
                if (map.containsKey(c))
                {
                    map.put(c, map.get(c) + 1);
                }
                else
                {
                    map.put(c, 1);
                }
            }
    
            for (int i = 0; i < a.length(); i++)
            {
                char c = a.charAt(i);
                if(map.containsKey(c))
                {
                    if (map.get(c) == 0)
                    {
                        return false;
                    }
                    else
                    {
                        map.put(c, map.get(c) - 1);
                    }
                }
                else
                {
                    return false;
                }
                
            }
            map.clear();
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(find(a, b));
        sc.close();
    }
}
