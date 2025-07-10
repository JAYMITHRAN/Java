import java . util.*;
class Friday{
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int sum =0;
    while(a>0)
    {
      int digit = a%10;
      int result = 1;
      for (int i =0;i<digit;i++)
      {
        result*=digit;
      }
      sum+=result;
      a=a/10;
    }
    System.out.print(sum);
    jarvis.close();
  }
}