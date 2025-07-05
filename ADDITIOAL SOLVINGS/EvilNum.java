import java.util.*;
class Friday{
  static boolean Evil(int a)
  {
    int count =0;
    while (a>0){
      if((a&1)==1)
      {
        count++;
      }
      a=a>>1;
    }
  return (count%2==0);
  }
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    if(Evil(a)) System.out.print("Evil Number");
    else System.out.print("Not a Evil Number");
    jarvis.close();
  }
}