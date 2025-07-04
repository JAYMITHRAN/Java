import java.util.*;
class Friday{
  public static  boolean Prime(int n)
  {
    if (n<2) return false;
    if(n==2) return true;
    for(int i= 2;i<=n/2;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int count =0;
    for(int i=1;i<=a;i++)
    {
        if(Prime(i))
        {
          count+=1;
          if(count%2!=0)
          {
            System.out.print(i + " ");
          }
        }
    }
    jarvis.close();
  }
}