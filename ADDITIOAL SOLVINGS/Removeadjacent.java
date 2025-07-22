import java.util.*;
class Friday {

    public static String Remove(String s) 
    {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i =0;i<s.length();i++) 
        {
          char ch= s.charAt(i);
            if (top != -1 && stack[top] == ch) {
                top--;
            } else {
                stack[++top] = ch;
            }
        }
        return new String(stack, 0, top + 1);
    }

    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = jarvis.nextLine();

        System.out.println(Remove(input));

        jarvis.close();
    }
}