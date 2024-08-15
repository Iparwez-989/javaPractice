package Arrays;

import java.util.Scanner;

public class findUnique {
    static int unique(int[] arr){
        int ans =-1;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=-1){
                ans= arr[i];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] arr = new int[n]; //1234312
        System.out.println("Enter array Elements: ");
        for(int i =0; i<n;i++){
            arr[i]= s.nextInt();
        }
        System.out.println("The unique number is : "+unique(arr));
    }
}
