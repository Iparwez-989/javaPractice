public class sumOfDigitPrime{
    static void checkPrime(int n ){
        boolean isPrime = true;
        for(int i =2;i<n;i++){
            if(n%i==0){
                isPrime= false;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number.");
        }
    }
    static int digitSum(int num){
        int sum = 0;
        while(num!=0){
            sum = sum+(num%10);
            num = num/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 23;
        int res = digitSum(n);
        System.out.println(res);
        checkPrime(res);
        
        
    }
}