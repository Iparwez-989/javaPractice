package Arrays;

import java.util.Scanner;

public class repeatingNumber {
    static int repeated(int[] arr){
        
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("The repeated number is: "+ repeated(arr));
    }
}
