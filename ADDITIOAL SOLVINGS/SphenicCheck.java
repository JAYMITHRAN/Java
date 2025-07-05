import java.util.*;
class Friday {
    public static boolean Prime(int n) 
    {
        if (n <= 1)
            return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void checkSphenic(int num) 
    {
        int count = 0;
        for (int i = 2; i <= num && count <= 3; i++) 
        {
            if (Prime(i) && num % i == 0) 
            {
                count++;
                num /= i;
                while (num % i == 0) 
                {
                    num /= i;
                }
            }
        }

        if (count == 3 && num == 1)
            System.out.println("Sphenic Number");
        else
            System.out.println("Not a Sphenic Number");
    }
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        int a = jarvis.nextInt();
        checkSphenic(a);
        jarvis.close();
    }
}
