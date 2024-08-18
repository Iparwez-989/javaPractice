package a2z;

import java.util.Arrays;

public class moveZerosToEnd {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    static int[] move(int[] arr){
        int n = arr.length;
        int j = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i = j+1;i<n;i++){
            if(arr[i]!=0){
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }
    
    
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,4,0,6,8,9,0,0};
        int[] ans = move(arr);
        // int[] ans = new int[arr.length];
        
        // int idx = 0;
        // int j = arr.length-1;
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i]>0){
        //         ans[idx] = arr[i];
        //         idx++;
        //     }else{
        //         ans[j]= arr[i];
        //         j--;
        //     }
        // }
        System.out.println(Arrays.toString(ans));

    }
}
