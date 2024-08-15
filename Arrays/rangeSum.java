package Arrays;

import java.util.*;

public class rangeSum {
    static int[] prefSum(int[] arr){
        int n = arr.length;
        for(int j =1 ;j<n;j++){
            arr[j] = arr[j-1]+arr[j];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n+1];
        for(int i =1; i<=n; i++){
            arr[i] = s.nextInt();
        }
        int[] ans = prefSum(arr);
        System.out.println(Arrays.toString(ans));
        int q = 3;
        while(q>0){
            int l= s.nextInt();
            int r =s.nextInt();
            int res = ans[r]-ans[l-1];
            System.out.println(res);
            q--;
        }
        
        
        


    }
}
