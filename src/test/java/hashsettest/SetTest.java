package hashsettest;

import hashset.SetCreate;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.*;

public class SetTest extends TestCase {
    HashSet<String> hset = new HashSet<>();
    SetCreate sc = new SetCreate();
    Iterator<String> iterateFunIterator = sc.iterateFun(hset);
    public void testLoop() {

        String[] elements = {"a","c","b","A"};
        hset.addAll(Arrays.asList(elements));
        String[] expectedListOutput = hset.toArray(new String[0]);
        Iterator<String> iterate = hset.iterator();
        for (int i = 0; i < hset.size(); i++) {
            //for loop
            Assert.assertEquals(expectedListOutput[i], sc.iterateUsingForLoop(hset)[i]);
        }
        int i=0;
        for(String val:hset){
            Assert.assertEquals(val,sc.iterateUsingForLoop(hset)[i++]);
        }
        Iterator<String> iterateFunIterator = sc.iterateFun(hset);
        while(iterate.hasNext()){
            Assert.assertEquals(iterate.next(),iterateFunIterator.next());
        }

    }

}
