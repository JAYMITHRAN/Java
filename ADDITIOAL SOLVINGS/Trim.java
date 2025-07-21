import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    String s = jarvis.nextLine();
    String [] arr = s.split("\\s+");
    for(int i=arr.length-1;i>=0;i--)
    {
      if(i==0) System.out.print(arr[i]);
      else System.out.print(arr[i]+" ");

    }

    jarvis.close();
  }
}