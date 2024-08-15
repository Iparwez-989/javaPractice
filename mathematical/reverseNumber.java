import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int res = 0;
        while(num!=0){
            int last_digit = num%10;
            res= res*10+last_digit;
            num = num/10;
        }
        System.out.println(res);
        
       
        
        

        

    }
}
