import java.util.*;

class Friday {
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);

        int a = jarvis.nextInt();
        
        long w = a;

        double d = w; 

        int n = (int)d; 

        System.out.println("Original int: " + a);
        System.out.println("Int to long: " + w);
        System.out.println("Long to double: " + d);
        System.out.println("Double back to int: " + n);
        
      jarvis.close();
    }
}
