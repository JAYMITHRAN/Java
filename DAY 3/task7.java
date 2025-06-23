import java.util.*;
class Friday
{
    public static void main(String[] args) 
    {
        Scanner jarvis = new Scanner(System.in);
        char ch = jarvis.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
        {
            System.out.println("It is an Alphabet.");
        } 
        else if (ch >= '0' && ch <= '9') 
        {
            System.out.println("It is a Digit.");
        } 
        else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) ||(ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126)) 
        {
            System.out.println("It is a Special Character.");
        } 
        else 
        {
            System.out.println("It is Others.");
        }
        jarvis.close();
    }
}
