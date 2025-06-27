import java.util.*;

class Friday {
  public static void main(String[] args) {
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();
    
    int count = 0;
    int num = 2;  
    int prime = 0;

    while (count < n) 
    {
      boolean isPrime = true;

      if (num == 2)
       {
      
        isPrime = true;
      } 
      else if (num % 2 == 0 || num < 2) 
      {

        isPrime = false;
      } 
      else {
        for (int i = 3; i * i <= num; i += 2) 
        {
          if (num % i == 0) 
          {
            isPrime = false;
            break;
          }
        }
      }

      if (isPrime) 
      {
        count++;
        prime = num;
      }

      num++;
    }

    System.out.println(prime);
    jarvis.close();
  }
}
