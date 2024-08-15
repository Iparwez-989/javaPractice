import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many fibonacci series you want: ");
        int n = s.nextInt();
        int a =0;
        int b = 1;
        int sum=0;
        System.out.println(a);
        System.out.println(b);
        for(int i =0; i<n-2;i++){
           
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
    }
}