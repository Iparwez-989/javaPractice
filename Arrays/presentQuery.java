package Arrays;

import java.util.Scanner;

public class presentQuery {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i =0; i<arr.length;i++){
            freq[arr[i]]=freq[arr[i]]+1;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter number of queries: ");
        int q = s.nextInt();


        while (q!=0) {
            System.out.println("Enter number to be searched: ");
            int x = s.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }

    }
}
