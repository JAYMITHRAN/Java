import java.util.*;
class Friday{
  public static boolean Divisible(int n)
  {
    if(n==0 || n==7) return true;
    while(n>0)
    {
      n=n-7;
    }
    while(n<0)
    {
      n=n+7;
    }

    return n==0;
  }
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    if(Divisible(a))
    {
      System.out.print("True");
    }
    else{
      System.out.print("False");
    }
    jarvis.close();
  }
}