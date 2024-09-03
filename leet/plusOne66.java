package leet;

import java.util.Arrays;

public class plusOne66 {

    static int[] plusOne(int[] arr){
        int n = arr.length;
        int ans[] = new int[n+1];
        for(int i = n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;

        }
        ans[0]=1;
        return ans;

    }

    public static void main(String[] args) {
        int[] arr ={9,9,9,9};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
        
    }
}
