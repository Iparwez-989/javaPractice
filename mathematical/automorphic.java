public class automorphic {
    public static void main(String[] args) {
        int n = 376;
        int sq = n*n;
        boolean isAutomorphic = true;
        
        while(n!=0){
            if(n%10 != sq%10){
                isAutomorphic = false;
                break;
                
            }
            n= n/10;
            sq=sq/10;
        }
        if(isAutomorphic==true){
            System.out.println("It is automorphic");

        }else{
            System.out.println("It is not an automorphic");
        }
        
    }
}
