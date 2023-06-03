public class BubbleSort {
    public static void bubble_sort(int arr[]) {
        for(int i = 0; i<arr.length-1; i++) {
            for(int j = 0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        System.out.print("Before Sorting : ");
        printArr(arr);
        bubble_sort(arr);
        System.out.print("After Sorting : ");
        printArr(arr);
    }
}
