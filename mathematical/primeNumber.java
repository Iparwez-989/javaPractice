import java.util.*;
public class primeNumber{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int prime = 2;
        while(num!=0){
            boolean isPrime = true;
            // for(int i = 2; i<=Math.sqrt(prime);i++){
            for(int i = 2; i<prime;i++){
                if(prime%i==0){
                    isPrime= false;
                }

            }
            if(isPrime){
                System.out.println(prime);
                num--;
            }
            prime+=1;
        }

    }
}