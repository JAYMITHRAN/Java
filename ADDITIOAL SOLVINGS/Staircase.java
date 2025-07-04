import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    for(int i=2;i<=a;i+=2)
    {
      for(int j=0;j<i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
      for(int j=0;j<i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    jarvis.close();
  }
}