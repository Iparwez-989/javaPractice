package Arrays;

import java.util.Scanner;

public class arraySquareSort {
    static void printArray(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void reverse(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static int[] squareSort(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n-1;
        int k = 0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k] =(int) Math.pow(arr[left], 2);
                k++;
                left++;
            }
            else{
                ans[k] =(int) Math.pow(arr[right],2);
                k++;
                right--;
            }
        }
        return ans;

        
    
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = s.nextInt();
        System.out.println("Enter array elements in non-decreasing order: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int[] ans = squareSort(arr);
        reverse(ans);
        printArray(ans);
        

    }
}
