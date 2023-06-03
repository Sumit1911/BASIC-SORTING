import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class InbuiltSort {
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr);
        // printArr(arr);
        // Arrays.sort(arr, 2, 5);
        Collection.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);
    }
}
