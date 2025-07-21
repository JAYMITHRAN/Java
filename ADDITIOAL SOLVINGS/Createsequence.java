import java.util.*;
class Friday{
  public static boolean Contains(int i)
  {
    if(i==2 || i==5) return true;
    boolean yes  = true;
    while(i>0)
    {
      int dummy = i%10;
      if(dummy!=2 && dummy !=5)
      {
        yes = false;
      }
      i=i/10;
    }
    return yes;
  }
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    List<Integer> arr = new ArrayList<>();
    for(int i=1;i<=a;i++)
    {
      if(Contains(i))
      {
        arr.add(i);
      }
    }
    System.out.print(arr);
    jarvis.close();
  }
}