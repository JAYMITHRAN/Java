class Friday {
    public static void main(String[] args) { 
        int i= 101;
        while(true)
        {
            int dummy = i%10;
            int dum = i%10;
            if(dum%2==0)
            {
                System.out.print(dummy);
                break;
            }
            else{
                System.out.println("Not an Even");
                break;
            }
        }
    }
}
