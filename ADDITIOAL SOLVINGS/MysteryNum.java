import java.util.*;
class Friday{
  static int Reverse(int n)
  {
    int sum =0;
    while(n>0)
    {
      int digit = n %10;
      sum = sum*10 + digit;
      n=n/10;
    }
    return sum;
  }
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    int found=0;
    for(int i=0;i<a/2;i++)
    {
      if ((i + Reverse(i))==a)
      {
        System.out.print("Mystery Number");
        found =1;
        break;
      }
    }
    if (found==0) {
      
    System.out.print("Not a Mystery Number");
    }
    jarvis.close();
  }
}