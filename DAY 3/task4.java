import java.util.*;
class Friday 
{
    public static void main(String[] args) 
    {
        Scanner jarvis = new Scanner(System.in);
        int year = jarvis.nextInt();

        if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    System.out.println(year + " is a Leap Year.");
                } 
                else 
                {
                    System.out.println(year + " is NOT a Leap Year.");
                }
            } 
            else 
            {
                System.out.println(year + " is a Leap Year.");
            }
        }
        else 
        {
            System.out.println(year + " is NOT a Leap Year.");
        }
        
        jarvis.close();
    }
}
