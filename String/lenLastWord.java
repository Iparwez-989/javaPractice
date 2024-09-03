public class lenLastWord{
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String ans = "";
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{
                ans+=sb;
                sb= new StringBuilder();
            }
        }
        System.out.println(sb.length());
        
    }
}