package Arrays;

import java.util.*;

public class reverseList {
    static void reverse(ArrayList<Integer> arr1){
        int i = 0;
        int j = arr1.size()-1;
        while(i<j){
            // Integer temp = Integer.valueOf(arr1.get(i));
            int temp = arr1.get(i);
            arr1.set(i,arr1.get(j));
            arr1.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(0);
        arr1.add(90);
        arr1.add(30);
        arr1.add(80);
        arr1.add(86);
        arr1.add(10);
        System.out.println("original List "+arr1);
        Collections.reverse(arr1);
        System.out.println("Reversed list: "+arr1);
        Collections.sort(arr1);
        System.out.println("Ascending order" + arr1);
        Collections.sort(arr1,Collections.reverseOrder());
        System.out.println("Descending order" + arr1);
    }
}
