public class Gcd {
    public static void main(String args[]){

        int n1 = 7;
        int n2=8;
        int min = Math.min(n1,n2);
        
        while(min!=0){
            if(n1%min==0 && n2%min==0){
                break;             
        
            }
            min--;
        }
        System.out.println(min);
        
    }
}
