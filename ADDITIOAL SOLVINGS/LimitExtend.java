import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);
    int size = jarvis.nextInt();
    int[] arr = new int[size+1];
    for(int i=0;i<size;i++)
    {
      arr[i] = jarvis.nextInt();
    }
    int index = jarvis.nextInt();
    int element = jarvis.nextInt();
    for (int i = size; i > index; i--) 
    {
    arr[i] = arr[i - 1];
    }
    arr[index] = element;
    System.out.println(Arrays.toString(arr));
    jarvis.close();
  }
}