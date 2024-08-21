package a2z;

public class onceAppeared {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,2,1};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int cnt = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[j]== num){
                    cnt++;
                }
            }
            if(cnt==1){
                System.out.print(num +" ");
            }
        }
    }
}
