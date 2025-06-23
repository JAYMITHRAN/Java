import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner jarvis = new Scanner(System.in);
       
       long a = jarvis.nextLong();
       
       if(a<=127 && a>=-128)
       {
           System.out.print("Data Type: Byte");
       }
       else if(a<=32767 && a>=-32768)
       {
           System.out.print("Data Type: Short");
       }
       else if(a<=2147483647 && a>=-2147483648)
       {
           System.out.print("Data Type: Int");
       }
       else
       {
           System.out.print("Data Type: Long");
       }
       
        jarvis.close();
    }
}
