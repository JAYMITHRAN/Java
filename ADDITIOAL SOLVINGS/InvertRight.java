import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    for(int i=1;i<=a;i++)
    {
      for(int j=i;j<=a;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    jarvis.close();
  }
}