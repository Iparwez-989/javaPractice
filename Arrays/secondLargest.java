package Arrays;

import java.util.Scanner;

public class secondLargest {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
                

            }
        }
        return max;
    }
    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        for(int i =0; i<arr.length;i++){
            if(arr[i]==max){
                arr[i]= Integer.MIN_VALUE; //Replace all the max val to -infinity
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] arr = new int[n];//1,7,6,3,4,2
        System.out.println("Enter array Elements: ");
        for(int i =0; i<n;i++){
            arr[i]= s.nextInt();
        }
        System.out.println("Second max value is :"+findSecondMax(arr));

    }
}
