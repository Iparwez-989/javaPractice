public class maxIndex{
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,3};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int j =0;j<arr.length;j++){
            if(arr[j]==max){
                System.out.println("Found at index "+j);
                break;
            }
        }
        
    }
}