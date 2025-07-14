import java.util.*;
class Friday{
  public static int Fibonacci(int n)
  {
    if(n<=0) return 0;
    if(n==1) return 1;
    return Fibonacci(n-1) + Fibonacci(n-2);
  }
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();

System.out.print(Fibonacci(a));

    jarvis.close();
  }
}