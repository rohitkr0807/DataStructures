package Revision;

public class ArraysDemo {
    public static void main(String[] args) {
        int arr1[]={1,3,4,5,6,9};
        int arr2[]={1,3,4,5,7,13,43};
        System.out.println(arr1);   //Prints address of arr2
        System.out.println(arr2);   //Prints address of arr1
        System.out.println(arr1==arr2);   //Address can't be Equal
        int temp[]=arr1;
        arr1=arr2;
        arr2=temp;   //Array reversed
        for(int var:arr2)
            System.out.print(var+" ");
    }
}
