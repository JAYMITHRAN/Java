import java.util.*;
class Friday{
    public static void main(String[]args) {
        Scanner jarvis = new Scanner (System.in);
        int n = jarvis.nextInt();
        int og = n;
        int result =0;
        while(n>0)
        {
            int dummy = n%10;
            if(dummy !=0&&og%dummy==0  )
            {
                result+=1;
             
            }
            n=n/10;
        }
    System.out.print(result);
    jarvis.close();
    }
}