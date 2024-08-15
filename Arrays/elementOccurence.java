package Arrays;
import java.util.Scanner;

public class elementOccurence {
    static int countOccurence(int arr[],int n){
        int cnt = 0;
        for(int j=0;j<arr.length; j++){
            if(arr[j]==n){
                cnt++;
            }
            
        }
        return cnt;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        int [] arr = new int[size];
        
        
        System.out.println("Enter array elements: ");
        for(int i = 0; i<size; i++){
            arr[i]= s.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int n = s.nextInt();
        System.out.println("Occurence of "+n+" is: "+countOccurence(arr, n));
    }
}
