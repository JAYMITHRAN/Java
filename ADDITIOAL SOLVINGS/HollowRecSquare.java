import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int b = jarvis.nextInt();
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
        if(i==0  || i==(a-1)  || j==0 || j==(b-1))
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