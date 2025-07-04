import java.util.*;

class Friday {
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        int n = jarvis.nextInt(); 

        for (int i = 0; i < n; i++) 
        {
            
            for (int j = 0; j < n - i; j++) 
            {
                System.out.print((char) ('A' + j));
            }
            for (int j = 0; j < 2 * i; j++) 
            {
                System.out.print(" ");
            }

            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }

        jarvis.close();
    }
}
