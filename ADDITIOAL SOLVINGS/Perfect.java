import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    int sum =1;
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
     if(n<=1) 
     {
     System.out.println("True");
     }
     else{
      
          for (int i = 2; i <= Math.sqrt(n); i++) 
          {
              if (n % i == 0) 
              {
                  sum += i;
                  if (i != n / i) 
                  {
                      sum += n / i;
                  }
              }
          }
     }
          if (sum == n)
          {
            System.out.println("True");
          }
          else{
            System.out.println("False");
          }

    jarvis.close();
  }
}