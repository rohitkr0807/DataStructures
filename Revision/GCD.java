package Revision;

public class GCD {
    public static void main(String[] args) {
        int a=0;
        System.out.println(a);
        System.out.println(GCD(90,45));
        System.out.println(gcd(90,45));
    }
    public static int GCD(int a,int b)
    {
        if(a==0)
            return b;
        if(b==0)
            return a;
        if(a==b)
            return a;
        if(a>b)
            return GCD(a-b,b);
        return GCD(a,b-a);
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int gcd2(int a,int b)
    {
        if(a==0)
            return b;
        return gcd2(b%a,a);
    }
}
