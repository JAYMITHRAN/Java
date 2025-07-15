import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    for (int i=1;i<=a;i++)
    {
      for(int j=1;j<=a;j++)
      {
        if(j!=i)
        {
          for (int k=1;k<=a;k++)
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