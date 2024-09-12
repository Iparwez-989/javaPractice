package a2z;
public class longestSubArrays {
    static int longestSubArraySum(int[] arr, int sum){
        int len = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j =i ;j<arr.length;j++){
                int temp = 0;
                for(int k=i;k<=j;k++){
                    temp += arr[k];
                }
                if(temp==sum){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    static int reducedBrute(int[] arr, int sum){
        int len = 0;
        for(int i =0;i<arr.length;i++){
            int temp = 0;
            for(int j = i;j<arr.length;j++){
                temp+=arr[j];
                if(temp == sum){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,1,2,2,-1,-1,-1};
        int sum = 1;
       int len = reducedBrute(arr, sum);
        System.out.println(len);
    }
}
