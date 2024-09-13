package a2z;

public class kadanesAlgo {
    static int kadanes(int[] arr){
        int n = arr.length;
        int sum=0;
        int maxi=arr[0];
        for (int i = 0; i < n; i++) {
            sum+= arr[i];
            if(sum>maxi) maxi = sum;
            if(sum<0) sum=0;
        }
        return maxi;
    }
    static int soln(int[] arr){
        int n = arr.length;
        int maxVal = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0;
                for(int k = i;k<=j;k++){
                    sum+= arr[k];
                    maxVal= Math.max(maxVal, sum);
                }
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4 };
        int ans = kadanes(arr);
        System.out.println(ans);

        
    }
}
