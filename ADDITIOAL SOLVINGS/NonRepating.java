import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    
    Scanner jarvis = new Scanner(System.in);
    String s = jarvis.nextLine();
    for(int i=0;i<s.length();i++)
    {
      boolean got = false;
      for(int j=0;j<s.length();j++)
      {
        if (i!=j && s.charAt(i)==s.charAt(j)) 
        {
          got = true;
          break;
        }
      }
      if(!got)
      {
        System.out.print(s.charAt(i));
        break;
      }
    }
    
    jarvis.close();
  }
}