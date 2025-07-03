import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
 
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            for(int s=i;s<n;s++)
            {
                System.out.print("  ");
            }
            for(int s=i;s<n;s++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            for(int s=0;s<i;s++)
            {
                System.out.print("  ");
            }
            for(int s=0;s<i;s++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        jarvis.close();
    }
    
  }
