import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
        long fact= 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact *i;
        }
        
    System.out.print(fact);

    jarvis.close();
  }
}