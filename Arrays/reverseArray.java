package Arrays;

import java.util.Scanner;

public class reverseArray{
    static int[] reverse(int[] arr){
        int[] ans= new int[arr.length];
        int j =0;
        for(int i=arr.length-1; i>=0;i--){
            ans[j]= arr[i];
            j++;
        }
        return ans;
    }
    static void swapInArray(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]  = temp;
        
    }
    
    static void reverseInPlace(int[] arr){
        int i =0; int j = arr.length-1;
        while (i<j) {
          swapInArray(arr, i, j);
            i++;
            j--;  
        }
        
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i =0; i<n;i++){
            arr[i]= s.nextInt();
        }

        // int[] ans = reverse(arr);
        // for(int i =0;i<ans.length;i++)
        // {
        //     System.out.print(ans[i] +" " );
        // }
        reverseInPlace(arr);
        for(int k =0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
        


    }
}