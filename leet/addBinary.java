package leet;
public class addBinary {
    static String bin(String a, String b){
        long temp = Integer.parseInt(a,2);
        long temp2 = Integer.parseInt(b,2);
        long sum = temp+temp2;
        String ans = Long.toBinaryString(sum);
        return ans;
        
    }
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        int tempA = 0;
        int tempB = 0;
        int pwr = 0;
        if(a.charAt(0)=='0'&& b.charAt(0)=='0') System.out.println("0");
        for(int i = a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1'){
            tempA+=(int) Math.pow(2, pwr);
        }
        pwr++;
        }
        pwr = 0;
        for(int i = b.length()-1;i>=0;i--){
            
            if(b.charAt(i)=='1'){
            tempB+= (int) Math.pow(2, pwr);
        }
        pwr++;
        }
        int sum = tempA + tempB;
        StringBuilder sb = new StringBuilder("");
        while (sum!=0){
            sb.append(sum%2);
            sum/=2;
        }
        sb.reverse();

        // System.out.println(sb.toString());
        String ans = bin(a, b);
        System.out.println(ans);
    }
}
