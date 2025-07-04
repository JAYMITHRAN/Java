import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    String s = jarvis.nextLine();
    String g= "";
    for(int i =0;i<s.length();i++)
    {
      char ch = s.charAt(i);
      g= ch + g;
    }
System.out.print(g);

    jarvis.close();
  }
}