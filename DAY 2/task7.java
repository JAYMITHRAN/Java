import java.util.*;
class Friday {
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);


        double fahrenheit = jarvis.nextDouble();
        System.out.printf("%.2f",(fahrenheit - 32) * 5 / 9);


        jarvis.close();
    }
}
