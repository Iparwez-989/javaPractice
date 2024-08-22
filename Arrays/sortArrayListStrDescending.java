package Arrays;
import java.util.*;

public class sortArrayListStrDescending {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("hey");
        lst.add("i");
        lst.add("am");
        lst.add("Irfan");
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
    }
}
