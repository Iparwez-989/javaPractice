import java.util.*;
public class countNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int cnt = 0;
        while(num!=0){
            num = num/10;
            cnt++;
        }
        System.out.println(cnt);

        
    }
}
