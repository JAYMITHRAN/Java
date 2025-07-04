import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int column = a/2+1;
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<column;j++)
      {
        if(i==0 && j==0 || i==0 && j==column-1)
        {
          System.out.print("  ");
          continue;
        }
        else if(i==a/2 ||j==0 || j==column-1 || i==0 && j<column)
        System.out.print("* ");
        else{
          System.out.print("  ");
        }
      }

      System.out.println();
    }
    jarvis.close();
  }
}