package a2z;

public class consecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1,0};
        int cnt = 0;
        int maxCnt = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);


            }
            else{
                cnt = 0;
            }
            
        }
        System.out.println(maxCnt);
    }
}
