import java . util.*;
class Friday{
  static int isPalindrome(int a)
  {
    int og = a;
    int sum=0;
    while(a>0)
    {
      int digit = a%10;
      sum = sum*10 + digit;
      a=a/10;
    }
    if(og == sum)
    {
      return 1;
    }
    return 0;
  }
  static int isPrime(int a)
  {
    if (a<2) return 0;
    else if(a==2) return 1;
    for (int i=2;i<a/2+1;i++)
    {
      if(a%i==0)
      {
        return 0;
      }
    }
    return 1;
  }
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();
    if(isPalindrome(a)==1)
    {
      if(isPrime(a)==1)
      {
        System.out.print("Its a Palindrome and Prime Number");
      }
      else{
        System.out.print("Its a Palindrome And Not A Prime");
      }
    }
    else
    {
      System.out.print("Not a Palindreome");
    }
    jarvis.close();
  }
}