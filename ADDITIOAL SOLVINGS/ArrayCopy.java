import java.util.*;
class Friday{
  public static void main(String[]args)
  {
   int [] arr = {1,3,5,7,9,8,6};
   int[] coparr = new int[arr.length];

   int [] modarr = new int[arr.length];

   System.arraycopy(arr,0,coparr,0,arr.length);
   for(int i=0;i<arr.length;i++ )
   {
    modarr[i] = arr[i];
   }
   System.out.println("By CopyMethod : "+Arrays.toString(coparr));
   System.out.println("By ManualMethod : "+Arrays.toString(modarr));
  }
}