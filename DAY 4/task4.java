import java.util.*;
class Friday
{
  public static void main(String [] args)
  {
    Scanner jarvis = new Scanner(System.in);
    int len =0;
    String Big = "";
    String a = jarvis.nextLine();
    String [] arr = a.split(" ");
    for(int i=0;i<arr.length;i++)
    { 
      if(arr[i].length()>len)
      {
        len = arr[i].length();
        Big = arr[i];
      }
    }
    System.out.print(Big);
    jarvis.close();
  }
}