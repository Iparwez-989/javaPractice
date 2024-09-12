package a2z;

import java.util.Arrays;

public class sort012 {
    static void sort(int[] arr){
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]== 0) cnt0++;
            else if(arr[i]==1) cnt1++;
            else cnt2++;
        }
        for(int i =0;i<cnt0;i++){
            arr[i] = 0;
        }
        for(int i =cnt0;i<cnt0+cnt1;i++){
            arr[i] = 1;
        }
        for(int j = cnt0+cnt1; j<arr.length;j++){
            arr[j] = 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
