import java.util.Arrays;

public class lastwordlen {
    static int lenLast(String s){
        String[] sub = s.split(" ");
        return sub[sub.length-1].length();
    }
    public static void main(String[] args) {
        String s = " hello world     ";     
        String str = s.trim();
        int cnt=0;
        for (int i = str.length()-1; i>=0 ; i--) {
            char ch = str.charAt(i);
            if(ch!=' '){
                cnt++;
            }
            else break;
        }
        System.out.println(cnt);
    }
}
