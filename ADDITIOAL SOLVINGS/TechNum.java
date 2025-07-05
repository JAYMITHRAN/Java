  import java.util.*;
  class Friday{
    static int Digit(String s)
    {
      int sum =0;
      for(int i=0;i<s.length();i++)
      {
        int a = s.charAt(i)-'0';
        sum=sum*10+a;
      }
      return sum;
    }
    public static void main(String[]args)
    {
    
      Scanner jarvis = new Scanner(System.in);
      int a = jarvis.nextInt();
      String s = a + "";
      if(s.length()%2==0)
      {
        int  size = s.length();
        String a1 ="";
        String a2 ="";
        for(int i=0;i<size/2;i++)
        {
          char ch = s.charAt(i);
          char c2 = s.charAt(size-i-1);
          a1 = a1+ch;
          a2 = c2+a2;
        }
        if((Digit(a1)+Digit(a2))*(Digit(a1)+Digit(a2))==a)
        {
          System.out.print("Tech Number");
        }
        else{
          System.out.print("Not a Tech Number");
        }
      }
      else System.out.print("Not a Tech Number");
      jarvis.close();
    }
  }