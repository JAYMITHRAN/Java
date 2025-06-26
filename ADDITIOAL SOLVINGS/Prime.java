import java.util.*;
class Friday{
  public static void main(String[]args)
  {

    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();

    boolean  found =true;
    if(n<2)
        {
            found = false;
          
        }
        else if(n==2)
        {
            found = true;
          
        }
        else
        {
            for(int i=2;i<n/2+1;i++)
            {
                if(n%i==0)
                {
                    found = false;
                    break;
                }
            }
        }
        System.out.print(found);
        

    jarvis.close();
  }
}