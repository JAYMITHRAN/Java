import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    System.out.print("Pattern 1 : \n\n");
    for(int i=0;i<a;i++)
    {
      for(int j=i;j<a;j++)
      {
        char ch = 'A';
        System.out.print((char)(ch+j) + " ");

      }
      System.out.println();
    }
    System.out.println("\nPattern 2 : \n");
    for(int i=0;i<a;i++)
    {
      for(int j=i;j<a;j++)
      {
        char ch = (char)(65 + a);
        System.out.print((char)(ch-i-1) + " ");

      }
      System.out.println();
    }
    System.out.println("\nPattern 3 : \n");
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<=i;j++)
      {
        char ch = 65;
        System.out.print((char)(ch+j) + " ");

      }
      System.out.println();
    }
    System.out.println("\nPattern 4 : \n");
    for(int i=0;i<a;i++)
    {
      for(int j=-1;j<i;j++)
      {
        char ch = (char)(65 + a-1);
        System.out.print((char)(ch-j-1) + " ");

      }
      System.out.println();
    }
    System.out.println("\nPattern 5 : \n");
    for(int i=0;i<a;i++)
    {
      for(int j=i;j<a;j++)
      {
        char ch = 65;
        System.out.print((char)(ch+i) + " ");

      }
      System.out.println();
    }
    System.out.println("\nPattern 6 : \n");
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<=i;j++)
      {
        char ch =(char) (65+i);
        System.out.print((char)(ch-j) + " ");

      }
      System.out.println();
    }
    jarvis.close();
  }
}