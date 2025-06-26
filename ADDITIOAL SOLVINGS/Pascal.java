import java.util.*;
class Friday{
  public static void main(String[]args)
  {
  
    Scanner jarvis = new Scanner(System.in);
    int n = jarvis.nextInt();

        ArrayList<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1); 

        for (int i = 1; i < n; i++) {
            val = val * (n - i);
            val = val / i;
            row.add((int)(val % 1000000007));
        }
      System.out.print(row);

    jarvis.close();
  }
}