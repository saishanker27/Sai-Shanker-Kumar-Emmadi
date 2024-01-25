package strings;

public class VowelCount {
    public static int countVowels(String str){
        int count=0;
        String st = str.toLowerCase();
        for(int i=0;i<st.length();i++) {
            if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u' )
                count++;
        }
        return count;
    }

}