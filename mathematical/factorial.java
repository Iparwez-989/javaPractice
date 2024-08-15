import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = s.nextInt();
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact *i;
        }
        System.out.println(fact);


        
    }
}
