

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder(s.nextLine());
        //pHySiCs -->PhYsIcS
        for(int i = 0; i<str.length();i++){
            boolean flag = true; // initially Capital
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int ascii = (int) ch;
            if(ascii >= 97) flag = false; //Small
            if(flag == true){
                ascii+=32;      // difference between capital and small is 32 in ascii
                char dh = (char) ascii;
                str.setCharAt(i, dh);
            }
            else{
                ascii-=32;
                char dh = (char) ascii;
                str.setCharAt(i, dh);
            }
            

        }
        System.out.println(str);
        
    }
}
