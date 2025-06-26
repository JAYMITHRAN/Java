import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
    
        for(int i=1;i<n/2+1;i++)
        {
            if(n%i==0)
            {
               System.out.print(i +" ");
            }
        }
        System.out.print(n);
        
    jarvis.close();
  }
}