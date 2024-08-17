package a2z;
import java.util.*;
public class secondLargest{
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];

        }
        return max;
    }
    static int secondLargest(int[] arr){
        int max = findMax(arr);
        if(arr.length ==1){
            return -1;
        }
        else{
            for(int i =0;i<arr.length;i++){
            if(arr[i] == max){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
        }
        
    }
    static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int secondSmallest(int[] arr){
        int min = smallest(arr);
        if(arr.length==1) {
            return -1;
        }
        else{
            for(int i =0;i<arr.length;i++){
                if(arr[i] == min){
                    arr[i] = Integer.MAX_VALUE;
                }
            }
            int secSmallest= smallest(arr);
            return secSmallest;
        }
            
        }
      
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,7};
        // int[] arr2 = arr.clone();
        
        int sec_min = secondSmallest(arr);
        int sec_max = secondLargest(arr);
        System.out.println("Second largest element in the array is: "+sec_max);
        System.out.println("Second smallest element in the array is: "+ sec_min);
    }
}