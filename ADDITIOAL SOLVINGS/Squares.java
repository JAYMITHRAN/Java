import java.util.*;
class Friday{
  public static void main(String[]args)
  {
  
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();

    for(int i=1;i<n;i++)
    {
      if(i*i == n)
      {
        System.out.print(i);
        break;
      }
      if(i*i>n)
      {
        System.out.print("Not A perfect Square");
        break;
      }
    }

    jarvis.close();
  }
}