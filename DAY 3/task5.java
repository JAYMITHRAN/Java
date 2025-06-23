import java.util.*;
class Friday{
    public static void main(String[] args) 
    {
        Scanner jarvis = new Scanner(System.in);
        int score = jarvis.nextInt();

        if (score >= 90 && score <= 100) 
        {
            System.out.println("Safe Zone");
        } 
        else if (score >= 70 && score <= 89) 
        {
            System.out.println("Warning Zone");

            if (score % 5 == 0) 
            {
                System.out.println("Shield Activated");
            }
        } 
        else if (score >= 50 && score <= 69) 
        {
            System.out.println("Burn Zone");

            if (score % 2 == 0) 
            {
                System.out.println("Chance to Escape");
            }
        } 
        else if (score >= 0 && score <= 49) 
        {
            System.out.println("Lava Death");
        } 
        else 
        {
            System.out.println("Game Error");
        }

        jarvis.close();
    }
}
