package Arrays;
import java.util.*;
public class arrayPartition {
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum+arr[i];
        }
        return totalSum;
    }
    static boolean partition(int[] arr){    //without suffix sum array
        int totalSum = findArraySum(arr);
        int pref = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            pref = pref + arr[i];
            int suffix = totalSum- pref;
            if(suffix == pref){
                return true;
            }
        }
        return false;
    }
    static int[] prefix(int[] arr){
        int n = arr.length;
        int[] prefixArray = new int[n];
        prefixArray[0]= arr[0];
        for(int i =1; i<n;i++){
            prefixArray[i] = prefixArray[i-1]+ arr[i];
        }

        return prefixArray;
    }
    static int[] suffix(int[] arr){
        int n = arr.length;
        int suffixArray[] = new int[n];
        suffixArray[n-1]= arr[n-1]; 
        for(int i = n-2;i>=0;i--){
            suffixArray[i] = suffixArray[i+1]+ arr[i];
        }
         return suffixArray;
    }
    static boolean checkPartition(int[] arr){

        int pref[] = prefix(arr);
        int suff[] = suffix(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(pref[i] == suff[i+1]){
                return true;
            }
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        // System.out.println("Array partitioning possible: "+ partition(arr));
        System.out.println("Array partitioning possible: " + checkPartition(arr));
    }
}
