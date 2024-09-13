package a2z;

import java.util.ArrayList;
import java.util.Arrays;

public class kadanesAlgo {
    static int[] kadanAlgo(int[] arr){
        int n = arr.length;  //-2,1,-3,4,-1,2,1,-5,4
        
        int sum = 0;
        int maxi = arr[0];
        int ansStart = -1;
        int ansEnd = -1;
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            
            if(sum>maxi){
                maxi = Math.max(maxi, sum);
                ansStart= start;
                ansEnd=i;
            }
            if(sum<0) sum = 0;
            if(sum == 0) {
                start = i+1;
            }
        }
        int[] ans = new int[ansEnd-ansStart+1];
        for(int i =ansStart;i<=ansEnd;i++){
            ans[i-ansStart]= arr[i];
        }
        return ans;


    }
    static int kadanes(int[] arr){
        int n = arr.length;
        int sum=0;
        int maxi=arr[0];
        for (int i = 0; i < n; i++) {
            sum+= arr[i];
            if(sum>maxi) maxi = sum;
            if(sum<0) sum=0;
        }
        return maxi;
    }
    static int soln(int[] arr){
        int n = arr.length;
        int maxVal = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0;
                for(int k = i;k<=j;k++){
                    sum+= arr[k];
                    maxVal= Math.max(maxVal, sum);
                }
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4 };
        // int ans = kadanes(arr);
        // System.out.println(ans);
        int[] ans = kadanAlgo(arr);
        System.out.println(Arrays.toString(ans));
       
        
    }
}
