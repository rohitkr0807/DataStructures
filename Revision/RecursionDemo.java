package Revision;

public class RecursionDemo {
    public static void main(String[] args) {
//        printReverse(10);
        print(10);
    }
    public static void printReverse(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        printReverse(n-1);
    }
    public static void print(int n)
    {
        if(n==0)
            return;
        print(n-1);
        System.out.println(n);
    }
}
