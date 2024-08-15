package Arrays;

import java.util.Scanner;

public class sortEvenOdd {
    static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    static void swap(int arr[] ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void sortNumber(int[] arr){
        int n = arr.length;
        int left =0;
        int right = n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is: ");
        printArray(arr);
        System.out.println();
        System.out.println("The sorted array is: ");
        sortNumber(arr);
        printArray(arr);
        

        
        
    }
}
