public class removeMajority {
    public static void main(String[] args) {
        int[] arr = {1,4,2,4,2,2,3,5}; 
        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                arr[i] = Integer.MIN_VALUE;
            }
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
