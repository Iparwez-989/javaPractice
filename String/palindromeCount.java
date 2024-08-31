public class palindromeCount{

    static boolean checkPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;

        }
        return flag;
    }

    public static void main(String[] args) {
        String str1 = "abcba";
        int count = 0;
       System.out.println(str1.substring(0,3));
        for(int i =0;i<str1.length();i++){
            for(int j = i+1;j<=str1.length();j++){
                // System.out.println(str1.substring(i, j));
                if(checkPalindrome(str1.substring(i, j))==true){
                    System.out.print(str1.substring(i, j)+ " ");
                    count++;
                } 
                
            }
        }
        System.out.println("\nNumber of palindrome substring: " + count);
}
}