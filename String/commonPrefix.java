public class commonPrefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow","light"};
        int n = str.length;
        String res = "";
        
        for (int i = 0; i < n-1; i++) {
            if(str[i].charAt(i)==str[i+1].charAt(i)){
                res+=str[i].charAt(i);
            }
        }
        System.out.println(res);
    }
}
