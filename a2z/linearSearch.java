package a2z;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 1;
        boolean found = false;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==num){
                System.out.println(num + " is found at " + i+ " index.");
                found = true;
                break;
            }
            
        }
        if(found == false){
            System.out.println(-1);
        }
        
    }
}
