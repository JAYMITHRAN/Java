import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    for(int i=1;i<=a*2 +1 ;i++)
    {
      for(int j=0;j<i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    jarvis.close();
  }
}