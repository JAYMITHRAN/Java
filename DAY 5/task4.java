class Friday{
    public static void main(String[] args) {
       
      String a = "Pokemon";
      int n = a.length();
      for (int i = 0;i<n;i++)
      {
        for (int j= i+1;j<=n;j++)
        {
          System.out.println(a.substring(i,j));
        }
      }
      for (int i=0;i<n;i++)
      {
        String temp="";
        for(int j = i;j<n;j++)
        {
          temp+=a.charAt(j);
          System.out.println(temp);
        }
      }
    }
}