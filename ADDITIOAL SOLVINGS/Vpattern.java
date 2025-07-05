import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    System.out.println("Inverted V Pattern \n");
    for(int i=1;i<=a;i++)
    {
      for(int j=i;j<a;j++)
      {
        System.out.print(" ");
      }
      for(int j=0;j<i;j++)
      {
        if(j==i-1)
        System.out.print((char)(65+a-i));
      }
      for(int j=0;j<i-1;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<i-1;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<i;j++)
      {
        if(j==i-1)
        System.out.print((char)(65+a-i));
      }
      System.out.println();
    }
    System.out.println("\nV Pattern \n");
    for(int i=1;i<=a;i++)
    {
      for(int j=0;j<i;j++)
      {
        System.out.print(" ");
      }
      for(int j=0;j<i;j++)
      {
        if(j==i-1)
        System.out.print((char)(65+a-i));
      }
      for(int j=i;j<a;j++)
      {
        System.out.print(" ");
      }
      for(int j=i;j<a-1;j++)
      {
        System.out.print(" ");
      }
      for(int j=0;j<i;j++)
      {
        if(j==i-1 && i!=a)
        System.out.print((char)(65+a-i));
      }
      System.out.println();
    }
    jarvis.close();
  }
}