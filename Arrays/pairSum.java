package Arrays;

import java.util.Scanner;

public class pairSum {
    static int countTriplets(int[] arr,int target){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }return ans;
    }
    static int countPair(int[] arr, int target){
        int pair =0;
        for(int i =0; i<arr.length; i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    pair++;
                }
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
        
            }   
        System.out.println("Enter target value" );
        int target = s.nextInt();
        System.out.println("No of pairs are: "+ countPair(arr, target) );
        System.out.println("No of triplets are: "+countTriplets(arr, target));
    }
}
