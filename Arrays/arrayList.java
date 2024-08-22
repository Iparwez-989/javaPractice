package Arrays;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(0);
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.add(8);
        System.out.println(l1.indexOf(5)); 
        l1.add(0,5);
        l1.set(2,10);
        l1.remove(Integer.valueOf(8));
        boolean ans = l1.contains(Integer.valueOf(16));
        System.out.println(ans);
        for(int i =0; i<l1.size();i++){
            System.out.print  (l1.get(i)+" ");
        }
    }
}
