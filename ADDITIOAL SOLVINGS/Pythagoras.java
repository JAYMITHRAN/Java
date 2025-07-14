import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    for (int i=1;i<=20;i++)
    {
      for(int j=1;j<=20;j++)
      {
        if(j!=i)
        {
          for (int k=1;k<=20;k++)
          {
            if((i*i) + (j*j)==(k*k))
            {
              System.out.println("Opposite :"+i + " Adjacent: "+ j +" Hypothensis: "+k);
            }
          }
        }
      }
    }
    jarvis.close();
  }
}