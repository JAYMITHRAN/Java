import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);

    int n = jarvis.nextInt();
        int og =n;
        int result =0;
        while(n>0)
        {
            int dummy = n%10;
            
            result = result + (dummy*dummy*dummy);
            
            n=n/10;
        }
        if(og==result)
        {
            System.out.print("True");   
        }
        else
        {
             System.out.print("False"); 
        }
        
    jarvis.close();
  }
}