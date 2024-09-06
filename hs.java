import java.util.HashMap;

public class hs
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(1, "a");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));

        System.out.println();

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(4));

        System.out.println();

        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("b"));
        System.out.println(map.containsValue("c"));
        System.out.println(map.containsValue("d"));

        System.out.println();

        System.out.println(map.size());

        System.out.println();

        System.out.println(map.isEmpty());

        System.out.println();

        System.out.println(map.remove(1));
        System.out.println(map.remove(2));
        System.out.println(map.remove(3));
        System.out.println(map.remove(4));
    }
}