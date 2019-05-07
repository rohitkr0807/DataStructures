package Revision;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(32));
        prime1toX(100);
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void prime1toX(int X)
    {
        for (int i = 2; i <=X ; i++) {
            if(isPrime(i)==true)
            {
                System.out.print(i+" ");
            }
        }
    }
}
