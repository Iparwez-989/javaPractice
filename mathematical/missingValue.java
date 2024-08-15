import java.util.*;

public class missingValue {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5,9,10,11,13};
        int size = arr[arr.length-1] - arr.length+1;
        int miss = 0;
        int i =0;
        int ans[] = new int[size];
        int k =0;
        while(i<arr.length){
            if(arr[i]==miss){
                i++;

            }
            else{
                ans[k]= miss;
                k++;
            }
            miss++;
        }
        

        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print(ans[j] + " ");
            }
            System.out.println(ans.getClass().getSimpleName());
            
    }
    

}
