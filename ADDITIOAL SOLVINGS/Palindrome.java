import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
    int res =0;
    int og = n;
        while(n>0)
        {
          int dummy = n%10;  
          res = res *10 +dummy;
          n=n/10;
        }
        if(res == og)
        {
          System.out.println("True");
        }
        else
        {
          System.out.println("False");
        }

    jarvis.close();
  }
}