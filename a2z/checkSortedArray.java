package a2z;

public class checkSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        boolean flag = true;
        for(int i =0;i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
            }
            

        }
        if(flag == true){
            System.out.println(flag);
        }
        else{
            System.out.println(flag);
        }
    }
}
