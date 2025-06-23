import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        int a = jarvis.nextInt();
        int b = jarvis.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;  
        System.out.print(a + " " + b);
        jarvis.close();
    }
}
