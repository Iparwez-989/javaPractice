package a2z;

import java.util.Arrays;

public class a2zLargestElement {
    public static void main(String[] args) {
        int arr[] = {1,4,23,5,6,34,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
