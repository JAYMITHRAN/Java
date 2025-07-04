import java.util.*;
class Friday {
    public static boolean Isomorphic(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) 
        {
            return false;
        }
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for (int i = 0; i < s1.length(); i++) 
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            int i1 = c1 - 'a';
            int i2 = c2 - 'a';
            if (map1[i1] == 0 && map2[i2] == 0) 
            {
                map1[i1] = i2 + 1; 
                map2[i2] = i1 + 1;
            } 
            else 
            {
                if (map1[i1] != i2 + 1 || map2[i2] != i1 + 1) 
                {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        String s1 = jarvis.next();
        String s2 = jarvis.next();
        if (Isomorphic(s1, s2)) 
        {
            System.out.println("Its isomorphic");
        } 
        else 
        {
            System.out.println("Not Isomorphic");
        }
        jarvis.close();
    }
}
