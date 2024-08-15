import java.util.Scanner;

public class armStrong{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int originalNumber = n;
        int sum = 0;
        int rem;
        int cnt = 0;
        while(originalNumber!=0){
            originalNumber/=10;
            cnt++;
        }
        originalNumber=n;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum= sum+(int)Math.pow(rem,cnt);
        }
        if(originalNumber==sum){
            System.out.println("It's an armStrong");
        }
        else{
            System.out.println("It's not an armStrong");
        }
    }
}