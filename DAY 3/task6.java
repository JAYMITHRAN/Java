import java.util.Scanner;
class Friday {
    public static void main(String[] args) 
    {
        Scanner jarvis = new Scanner(System.in);
        int n = jarvis.nextInt();

        if (n % 2 != 0) 
        {
            System.out.println("Weird");
        } 
        else 
        {
            if (n >= 2 && n <= 5) 
            {
                System.out.println("Not Weird");
            } 
            else if (n >= 6 && n <= 20) 
            {
                System.out.println("Weird");
            } 
            else if (n > 20) 
            {
                System.out.println("Not Weird");
            }
        }    
        jarvis.close();
    }
}
