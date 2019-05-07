package Revision;

public class ArraysQuestion {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 3, 5, 11, 2, 3, 54, 76, 3, 2, 1};
//        bubblesort(arr);
        QuickSort(arr);
        System.out.println(binarySearch(arr, 9));
        for (int var : arr)
            System.out.print(var + " ");
    }

    public static int binarySearch(int arr[], int n) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i + 1;
        }
        return index;
    }

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void QuickSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
