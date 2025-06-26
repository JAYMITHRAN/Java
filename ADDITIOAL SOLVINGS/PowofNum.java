import java.util.*;
class Friday{
    public static void main(String[]args) {
        Scanner jarvis = new Scanner (System.in);
        int n = jarvis.nextInt();
        
        int og =n;
        int rev = 0;
        int sum=1;
        while(n>0)
        {
            int dummy = n%10;
            rev = rev*10 + dummy;
            n=n/10;
        }
        for(int i=0;i<rev;i++)
        {
            sum*=og;
        }
    System.out.print(sum);
    jarvis.close();
    }
}