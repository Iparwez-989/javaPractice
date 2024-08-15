package Arrays;
import java.util.*;
public class checkSorted {
    static int[] kthSmallestAndLargestElem(int[] arr,int k){
        Arrays.sort(arr);
        int ans[] = {arr[k-1],arr[arr.length-k]};
        return ans;

    }
    
    static int[] smallestAndLargestElem(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
    }
    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){ //Condition for not sorted
                
                check=false;
                break;
            }
        }
        return check;

    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,1,7,8,5 };     //{1,2,5,7,8}
        int k = 2;
        System.out.println(isSorted(arr));
        // int[] ans = smallestAndLargestElem(arr);
        // System.out.println("Smallest element "+ans[0]);
        // System.out.println("Largest element "+ans[1]);
        int[] ans2 = kthSmallestAndLargestElem(arr, k);
        System.out.println("smallest" + ans2[0]);
        System.out.println("largest" + ans2[1]);
        
    }
}
