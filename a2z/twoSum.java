package a2z;

import java.util.Arrays;

public class twoSum {
    static void sum(int[] arr, int target){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]== target){
                    System.out.println("yes"+i+j); 
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        sum(arr, target);
        System.out.println(Arrays.toString(arr));

    }
}
