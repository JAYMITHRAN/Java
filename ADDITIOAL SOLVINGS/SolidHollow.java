import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    System.out.println("Solid Square : \n");
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<a;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.print("\nHollow Square : \n");
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<a;j++)
      {
        if(i==0  || i==(a-1)  || j==0 || j==(a-1))
        {
           System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    jarvis.close();
  }
}