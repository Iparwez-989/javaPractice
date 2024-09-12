package leet;

import java.util.Arrays;

public class mergeSorted{
    static void merge(int[] arr1, int[] arr2, int m, int n){
        int i = m-1;        
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            
            if(i>=0 && arr1[i]>arr2[j]){
                arr1[k]= arr1[i];
                k--;
                i--;
            }
            else{
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {2,0};
        int[] arr2 = {1};
        int m = 1;
        int n = 1;
         merge(arr1, arr2, m, n);
        System.out.println(Arrays.toString(arr1));

    }
}