package Arrays;

import java.util.Scanner;

public class lastOccurence {
    static int lastOccur(int arr[], int n){
        int lastOccured = -1;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]==n){
                lastOccured = i;
            }
        }
    return lastOccured;
    }
    public static void main(String[] args) {
        
    
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i<size; i++){
            arr[i]= s.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int n = s.nextInt();
    
    System.out.println(n +" is found at "+lastOccur(arr,n)+" index.");
}
}
