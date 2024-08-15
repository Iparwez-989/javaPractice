package Arrays;

public class strictlyGreater {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,7,6,3};
        int x=3;
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
