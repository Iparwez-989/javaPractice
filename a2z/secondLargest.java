package a2z;
public class secondLargest{
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];

        }
        return max;
    }
    static int secondLargest(int[] arr){
        int max = findMax(arr);
        for(int i =0;i<arr.length;i++){
            if(arr[i] == max){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sec_max = secondLargest(arr);
        System.out.println("Second largest element in the array is: "+sec_max);
    }
}