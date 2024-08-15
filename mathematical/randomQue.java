public class randomQue {
    public static void main(String[] args) {
       int n = 94385989;
       int max = 0;

        while(n!=0){
            boolean isPrime = true;
            int val= n%100;
            n=n/100;
            // System.out.println(val);
            for(int i = 2; i<val;i++){
                if(val%i==0){
                    isPrime= false;
                }
            }
                if(isPrime){
                    max=Math.max(max, val);
                }
        }
        if(max==0){
            System.out.println("-1");
        }
        else{
            System.out.println(max);
        }

        

    } 
}
