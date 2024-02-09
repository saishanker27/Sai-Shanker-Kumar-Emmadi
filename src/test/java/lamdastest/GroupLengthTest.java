package lamdastest;
import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.GroupLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GroupLengthTest extends TestCase {
    public void testGroupByLength() {
        // Given
        List<String> inputStrings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear");
        Map<Integer, List<String>> result = GroupLength.groupByLength(inputStrings);
        Assert.assertEquals(2, result.get(4).size());
        Assert.assertEquals(2, result.get(5).size());
        Assert.assertEquals(2, result.get(6).size());
    }
}