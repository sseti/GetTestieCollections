package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    TreeMap<String, Integer> test;

    @org.junit.Before
    public void setUp() throws Exception {
        test = new TreeMap<>();
        test.put("A",1);
        test.put("B",2);
        test.put("C",3);
        test.put("E",4);
    }
    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestTreeMapSize() { Assert.assertEquals(4, test.size()); }

    @Test
    public void TestTreeMapContainsKey() { Assert.assertTrue(test.containsKey("A")); }

    @Test
    public void TestTreeMapContainsValue() { Assert.assertTrue(test.containsValue(4)); }

    @Test
    public void TestTreeMapFloorKey() { Assert.assertEquals("E",test.floorKey("E")); }

    @Test
    public void TestTreeMapClear() {
        test.clear();
        Assert.assertEquals(true, test.isEmpty());
    }

}
