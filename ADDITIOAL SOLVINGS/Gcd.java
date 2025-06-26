import java.util.*;
class Friday{
  public static int gcd(int a, int b) {
        if (b == 0)
            return a; 
        return gcd(b, a % b); 
    }
  public static void main(String[]args)
  {
    
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
    int n2 = jarvis.nextInt();
    int result = gcd(n,n2);
    System.out.print("GCD is : "+result);
    jarvis.close();
  }
}