class Friday{
  public static void main(String[]args)
  {
    String [] arr = {"p"};
    if ( arr.length==0) 
    {
      System.out.print("No possible prefix");
      return;
    }
    String prefix = arr[0];

    for (int i=0;i<prefix.length();i++)
    {
      char ch = prefix.charAt(i);
      for (int j=1;j<arr.length;j++)
      {
        if(i>=arr[j].length() || arr[j].charAt(i)!=ch)
        {
          System.out.print(prefix.substring(0,i));
          return;
        }
        
      }
    }
    System.out.print(prefix);
  }
}