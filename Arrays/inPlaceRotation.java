package Arrays;

public class inPlaceRotation {
    static void swapInArray(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr,int i, int j){
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotate(int[] arr,int k){
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0,n-1);
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =101;
        
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        rotate(arr, k);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
