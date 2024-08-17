package a2z;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5};
         int n = arr.length;
         int k =1;
         k= k%n;
         int[] ans = new int[n];
         int j =0;
         for (int i = n-k; i < arr.length; i++) {
                ans[j]=arr[i];
                j++;
         }
         for (int i = 0; i < n-k; i++) {
            ans[j]= arr[i];
            j++;
         }
         System.out.println(Arrays.toString(ans));
    }
}
