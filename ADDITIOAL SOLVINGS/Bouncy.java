import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    boolean inc = false;
    boolean dec = false;
    int last = a%10;
    a=a/10;
    while(a>0)
    {
      int curr = a%10;
      if(curr>last) dec = true;
      else if(curr<last) inc = true;
      last = curr;
      a=a/10;
    }
    if(dec & inc) System.out.print("Its Bouncy Number");
    else System.out.print("Not a Bouncy Number");
    jarvis.close();
  }
}