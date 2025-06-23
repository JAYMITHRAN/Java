import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    //Area of Triangle
    
    Scanner jarvis = new Scanner(System.in);
    int height = jarvis.nextInt();
    int width = jarvis.nextInt();

    System.out.print((height*width)/2);

    jarvis.close();
  }
}