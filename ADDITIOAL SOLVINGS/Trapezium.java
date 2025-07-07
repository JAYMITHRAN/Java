import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   int k=1;
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int z = a *(a+1)+1;
    int s =a;
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<i;j++)
      {
        System.out.print("  ");
      }
      for(int j=i;j<a;j++)
      {
        System.out.print(k+" * ");
        k++;
      }
      for(int j=i;j<a;j++)
      {
      if(j==a-1)
      {
        System.out.print(z-a+j + " ");
      }
      else
      {
        System.out.print(z+j-a + " * "); 
      }
    }
     z=z-s;
    s--;
      System.out.println();
    }
    jarvis.close();
  }
}