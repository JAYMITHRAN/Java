import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
    int result =0;
    while(n>0)
     {
        int dummy = n%10;
        result = result*10 + dummy;
        n=n/10;
     }
     System.out.print("Reverse : "+ result);
    jarvis.close();
  }
}