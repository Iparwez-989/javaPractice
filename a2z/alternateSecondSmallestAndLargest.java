package a2z;

import java.util.Scanner;

public class alternateSecondSmallestAndLargest {

    static void secSmallAndLarge(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            System.out.println("2nd Smallest element: "+ -1);
            System.out.println("2nd Largest element: "+ -1);
        }
        else{
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            small= Math.min(small, arr[i]);
            large = Math.max(large,arr[i]);
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<sec_small && arr[i]!=small){
                sec_small= arr[i];
            }
        }
        System.out.println("The second smallest number is : "+ sec_small);
        for(int i =0; i<arr.length;i++){
            if(arr[i]>sec_large && arr[i]!=large){
                sec_large= arr[i];
            }
        }
        System.out.println("Second largest number is : "+ sec_large);
    }
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element: ");
        for(int i =0; i<n; i++){
            arr[i] = s.nextInt();
        }
        secSmallAndLarge(arr);

    }
}
