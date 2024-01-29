package hashset;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetCreate {
    public Iterator<String> iterateFun(HashSet<String> hset){
        Iterator<String> iterate = hset.iterator();
        while(iterate.hasNext()){
            iterate.next();
        }
        return hset.iterator();
    }
    public String[] iterateUsingForLoop(HashSet<String> hset){
        String[] arrele = hset.toArray(new String[0]);
        for (int i = 0; i < arrele.length; i++)
            return arrele;
        return new String[0];
    }
    public String[] iterateUsingEnhancedForLoop( HashSet<String> hset){
        for(String val:hset)
            return new String[]{val};
        return new String[0];
    }

}