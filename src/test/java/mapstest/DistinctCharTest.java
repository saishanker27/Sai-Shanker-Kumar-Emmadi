package mapstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import maps.DistinctChar;
import java.util.HashMap;
import java.util.Map;

public class DistinctCharTest extends TestCase {
    public void testDistinct() {
        DistinctChar val = new DistinctChar();
        //true case

        HashMap<Character, Integer> charcount = val.differentOccur("Ssai");
        Assert.assertEquals(2, charcount.get('s').intValue());
        Assert.assertEquals(1, charcount.get('a').intValue());
        Assert.assertEquals(1, charcount.get('i').intValue());

        //true case with space
        HashMap<Character, Integer> charcount2 = val.differentOccur("S sai");
        Assert.assertEquals(2, charcount2.get('s').intValue());
        Assert.assertEquals(1, charcount2.get('a').intValue());
        Assert.assertEquals(1, charcount2.get('i').intValue());
        Assert.assertNotSame(1, charcount2.get(' '));

        //false case
        HashMap<Character, Integer> charcount3 = val.differentOccur("Ssai");
        Assert.assertNotSame(1, charcount3.get('s').intValue());
        Assert.assertEquals(1, charcount3.get('a').intValue());
        Assert.assertEquals(1, charcount3.get('i').intValue());

        //Null case
        HashMap<Character, Integer> charnull = val.differentOccur("");
        Assert.assertNotSame(1, charnull.get(' '));
    }
}
