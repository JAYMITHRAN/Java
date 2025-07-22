import java.util.*;

class Friday {
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        int n = jarvis.nextInt();
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int a = i;
                int b = j;
                int c = size - 1 - i;
                int d = size - 1 - j;

                int minDist = a;
                if (b < minDist) minDist = b;
                if (c < minDist) minDist = c;
                if (d < minDist) minDist = d;

                System.out.print(n - minDist +" ");
            }
            System.out.println();
        }

        jarvis.close();
    }
}
