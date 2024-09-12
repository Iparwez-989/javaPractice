package a2z;
public class majority{
    static int majorityElem(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            int cnt = 0;
            for(int j =0;j<n;j++){
                if(arr[j] == arr[i]){
                    cnt++;
                }
                if(cnt>n/2){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int majority(int[] arr){
        int n = arr.length;
        int cnt = 0;
        int el=0;
        int cntr = 0;
        for (int i = 0; i < n; i++) {
            if(cnt==0){
                cnt=1;
                el= arr[i];
            }
            else if(arr[i] == el){
                cnt++;
            }
            else cnt--;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == el){
                cntr++;
            }
            if(cntr>n/2) return arr[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {2,2,5,3,5,5,3,5,5};
        int ans = majorityElem(arr);
        System.out.println(ans);
        
    }
}