package leet;

public class binary {
    static String add(String a, String b){
        int binary = 2;
        int carry= 0;
        int sum = 0;
        int n1 = a.length();
        int n2 = b.length();
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        while(n1!=0 || n2!=0){
            sum = a.charAt(i)+b.charAt(i)+carry;
            if(sum>=binary){
                
            }
            sb.append(sum);
            sum=0;
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String a = "1010";
        String b = "1010";
        String ans = add(a, b);
        System.out.println(ans);
    }
}
