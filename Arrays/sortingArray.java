package Arrays;
public class sortingArray {
    static void sortZerosAndOnes(int[] arr){
        int zeros =0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,1,0,0};
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sortZerosAndOnes(arr);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
