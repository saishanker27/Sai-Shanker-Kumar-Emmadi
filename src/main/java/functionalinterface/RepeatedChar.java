package functionalinterface;

import java.util.HashSet;
import java.util.Set;

public class RepeatedChar {
    public Set<Character> repeatedChar(String str){
        Set<Character> indchar = new HashSet<>();
        Set<Character> repchar = new HashSet<>();
        String st=str.toLowerCase();
        for(char ch:st.toCharArray()){
            if(!indchar.add(ch))
                repchar.add(ch);
        }
        return repchar;
    }
}