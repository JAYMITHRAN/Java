class Friday {
    static int Dsum(int n) 
    {
        int sum = 0;
        while(n > 0) 
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int isPrime(int n) 
    {
        if(n <= 1) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++) 
        {
            if(n % i == 0) return 0;
        }
        return 1;
    }

    public static int sumPrimes(int n)
     {
        int i = 2, sum = 0;
        while(n > 1) 
        {
            while(n % i == 0) 
            {
                sum += Dsum(i);
                n /= i;
            }
            i++;
        }
        return sum;
    }

    public static int isSmith(int n) {
        if(isPrime(n)==1) 
        {
            return 0; 
        }    
        int SumD = Dsum(n);
        int Fsum = sumPrimes(n);
        if(SumD == Fsum)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int num = 27; 
        if(isSmith(num)==1) 
        {
            System.out.println(num +" is Smith Number.");
        } 
        else 
        {
            System.out.println(num +" is NOT Smith Number.");
        }
    }
}
