import java.util.*;
class Friday {
  public static boolean isRotation(String o, String r) {
        int len = o.length();

        if (len != r.length()) return false;

        for (int i = 0; i < len; i++) 
        {
            String ror = "";

            for (int j = 0; j < len; j++) 
            {
                ror += o.charAt((i + j) % len);
            }

            if (ror.equals(r)) 
            {
                return true;
            }
        }

        return false;
    }
  public static void main(String[]args)
  {
    Scanner jarvis =  new Scanner(System.in);
    String a1 = jarvis.nextLine();
    String a2 = jarvis.nextLine();
    if (isRotation(a1, a2)) {
            System.out.println("it is a rotation");
        } else {
            System.out.println("Not a rotation");
        }
    jarvis.close();
  }
  
}