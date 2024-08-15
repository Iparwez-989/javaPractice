package Arrays;

public class prefixSum {
    static void withoutArrayPrefix(int[] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            arr[i] = arr[i-1]+ arr[i];
        }
    }
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for(int i =1; i<n; i++){
            pref[i] = pref[i-1]+ arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};//{1,3,6,10,15}
        // int pref[] = makePrefixSumArray(arr);
        // for(int i =0; i<pref.length;i++){
        //     System.out.print(pref[i]+" ");
        // }
        withoutArrayPrefix(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
