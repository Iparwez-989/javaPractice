package a2z;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,12};
        int max =arr[arr.length-1];
        for(int i =1; i<=max;i++){
            int flag = 0;
            for(int j =0; j<arr.length;j++){
                if(arr[j]==i){
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.print(i+" ");
            }
            
        }
    }
}
