package Arrays;
public class searchInsert {
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,6,7,9};
        int k =9;
        int j= 0;
        int flag = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==k){
                flag = 1;
                System.out.println(i);
            }


            if(k>arr[i] && k<arr[i+1]){
                System.out.println(i+1);
            }
            j++;
            
        }
        if(k>arr[arr.length-1]){
            System.out.println(j+1);
        }
        if(flag != 1 && k==0){
            System.out.println("0");
        }

    }
}
