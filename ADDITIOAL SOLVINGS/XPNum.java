import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
    int last = n%10;
    n=n/10;
    int sum=0;
    while(n>9)
    {
      int rev = n%10;
      sum+= rev;
      n=n/10;
    }
    if(sum == last+n)
    {
      System.out.print("Xylem");
    }
    else{
      System.out.print("Pholem");
    }
    jarvis.close();
  }
}