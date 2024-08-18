package a2z;

import java.util.Arrays;

public class removeDuplicates {
    static int count(int[] arr){
        int cnt = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                cnt++;
            }
        }
        return cnt;
    }
    static int[] removeDup(int[] arr){
        int count = count(arr);
        int res[] = new int[arr.length-count];
        int idx = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                res[idx]= arr[i];
                idx++;
            }
        }
        res[idx]=arr[arr.length-1];
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        int cnt = count(arr);
        System.out.println(cnt);
        int sol[] = removeDup(arr);
        System.out.println(Arrays.toString(sol));
    }
}
