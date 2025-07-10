import java.util.*;
class Friday
{
  public static void main(String [] args)
  {
    Scanner jarvis = new Scanner(System.in);
    String a = jarvis.nextLine();
    char [] arr = new char[a.length()];
   
    for (int i=0;i<a.length();i++)
    {
      arr[i] = a.charAt(i);
    }
    for(int j=0;j<arr.length;j++)
    {
      System.out.println(arr[j]);
    }
    jarvis.close();
  }
}