import java.util.*;
class Friday
{
  public static void main(String [] args)
  {
    Scanner jarvis = new Scanner(System.in);
    String a = jarvis.nextLine();
    //with inbuilt replace function
    String removeSpace = a.replace(" ","");
    System.out.println("Inbuilt Method : "+removeSpace);
    //without inbuilt function using for loop
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