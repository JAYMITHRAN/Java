import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    String a = jarvis.nextLine();
    int found = 0;
    if(a.length()<26)
    {
    for(char i ='a';i<='z';i++)
    {
      if(a.indexOf(i)==-1)
      {
        System.out.print("Not a Pangram");
        found =-1;
        break;
      }
    }
  }
  else 
  {found =-1;
    System.out.print("Not a Pangram");
}
  if(found==0)
    System.out.print("It s a Pangram");


    jarvis.close();
  }
}