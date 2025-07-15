import java.util.*;

public class CountRangePrime {
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = jarvis.nextInt();
        System.out.print("Enter end of range: ");
        int end = jarvis.nextInt();

        Prime p = new Prime();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (p.isPrime(i)) {
                count++;
            }
        }

        System.out.println("Number of primes between " + start + " and " + end + ": " + count);
        jarvis.close();
    }
}