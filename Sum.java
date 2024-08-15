import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int res = a+b;
        System.out.println("The sum of "+ a + " and " + b+ " is : "+ res);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();
        int result = x+y;
        System.out.println("The sum of "+ x + " and " + y + " is : "+ result);


    }
}