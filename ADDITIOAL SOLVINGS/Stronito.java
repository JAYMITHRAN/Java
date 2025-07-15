import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    int huns = 0;
    int tens =0;
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int res = a*2;
    System.out.println(res);
    if(res>=1000 || res<=9999)
    {
       huns = (res/10)%100;
       tens = huns%10;
       huns = huns/10;
    }
    if(tens == huns) System.out.print("Stronito Number");
    else System.out.print("Not a Stronito Number");
    jarvis.close();
  }
}