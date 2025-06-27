import java.util.*;
class Friday{

  public static int Fact(int n)
  {
    int fact =1;
    if(n <2)
    {
      return fact;
    }
    for(int i=1;i<=n;i++)
    {
      fact = fact *i;
    }
    return fact;
  }
  public static void main(String[]args)
  {
    
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
    
    int og = n;
    int sum =0 ;
    while(n>0)
    {
      int dummy = n%10;

      int result = Fact(dummy);
      sum+=result;
      n=n/10;
    }
    if(sum == og)
    {
      System.out.print("Krish Number");
    }
    else{
      System.out.print("Not A Krish Number");
    }

    jarvis.close();
  }
}