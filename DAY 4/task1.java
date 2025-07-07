import java.util.*;
class Friday
{
  public static void main(String [] args)
  {
    Scanner jarvis = new Scanner(System.in);
    String a = jarvis.nextLine();

    String result ="";
    for(int i=0;i<a.length();i++)
    {
      char c = a.charAt(i);
      if(c!=' ')
      {
        result = result + c;
      }
    }
    System.out.print("Manual Looping : "+result);
    jarvis.close();
  }
}