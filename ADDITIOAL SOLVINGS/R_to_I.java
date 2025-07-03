import java.util.*;

class Friday {

    public static int value(char c) 
    {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int calculation(String s) 
    {
        int total = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) 
        {
            int curr = value(s.charAt(i));
            int next = (i + 1 < len) ? value(s.charAt(i + 1)) : 0;

            if (curr < next) {
                total += (next - curr);
                i++;
            } else {
                total += curr;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        String s = jarvis.next();
        System.out.println(calculation(s));
        jarvis.close();
    }
}
