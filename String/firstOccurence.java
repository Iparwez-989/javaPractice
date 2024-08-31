public class firstOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle  = "sad";
        for(int i =0;i<haystack.length()-needle.length()+1;i++){
            if(needle.charAt(0)==(haystack.charAt(i))){
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    System.out.println("found"+i);
                    break;
                }
                else System.out.println("not found");
            }
        }
        
        
    }
}
