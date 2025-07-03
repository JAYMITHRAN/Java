import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    for(int i =0;i<a;i++)
    {
      for(int j=0;j<a;j++)
      {
        
        if(i==(a/2) || (j==a/2 || (j==0 && i<a/2)) || (i==0 && j>a/2) || (i==a-1)&&(j<a/2) || (j==a-1)&& (i>a/2))

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