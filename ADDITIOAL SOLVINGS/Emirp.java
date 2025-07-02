import java.util.*;
class Friday{
  public static boolean Palindrome(int n)
  {
    int og = n;
    int result = 0;
    while(n>0)
    {
      int dummy = n%10;
      result = result*10 + dummy;
      n=n/10;
    }
    if(result == og)
      return true;
    return false; 
  }
  public static boolean Prime(int n)
  {
    for(int i =2;i<n/2;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    if (a<=9) System.out.print("Not a Emirp Number");
    else{
      if(Palindrome(a) || !Prime(a))
      {
        System.out.print("Not a Emirp Number");
      }
      else if(!Palindrome(a) && Prime(a))
      {
        System.out.print("Its a Emirp Number");
      }
    }

    jarvis.close();
  }
}