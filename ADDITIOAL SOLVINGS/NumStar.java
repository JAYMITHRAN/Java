import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    for(int i=1;i<=a;i++)
    {
      for(int j=i;j<a;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        if(j==i)
        System.out.print(j);
        else
          System.out.print(j + "*");
      }
      System.out.println();
    }
      for(int i=1;i<=a;i++)
      {
        for(int j=0;j<i;j++)
      {
        System.out.print(" ");
      }
        for(int j=1;j<=a-i;j++)
        {
            if(j==a-i)
            System.out.print(j );
            else
            System.out.print(j + "*");
        }
        System.out.println();
      }
    jarvis.close();
  }
}