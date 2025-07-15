import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int [] arr = new int[a];
   
    for(int i=0;i<a;i++)
    {
      arr[i] = jarvis.nextInt();
    }
    int target = jarvis.nextInt();
    
    for(int i=0;i<a;i++)
    {
      if(arr[i]==target) System.out.print("{"+arr[i]+"}");
      
    }

    jarvis.close();
  }
}