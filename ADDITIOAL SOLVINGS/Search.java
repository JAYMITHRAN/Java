import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    String S = "batmanandrobinarebat";
    String pat = "bat";

  
        ArrayList<Integer> lst = new ArrayList<>();
        int index = S.indexOf(pat);
        while (index != -1) 
        {
            lst.add(index + 1); 
            index = S.indexOf(pat, index + 1);
            
    }
    System.out.print(lst);
    }
  }

  
