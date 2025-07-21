import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   
    Scanner jarvis = new Scanner(System.in);

    int [] arr = {10 ,5, 5, 5, 2};
    int target = jarvis.nextInt();
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        if(arr[i]==arr[j]) continue;
        for(int k=0;k<arr.length;k++)
        {
          if(arr[i]==arr[k] || arr[j]==arr[k]) continue;
          if (arr[i] + arr[j] + arr[k] == target)
          {
            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
          }

        }
      }
    }
    jarvis.close();
  }
}