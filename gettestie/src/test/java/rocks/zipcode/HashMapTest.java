package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    HashMap<String, Integer> Map;

    @org.junit.Before
    public void setUp() throws Exception {
        Map = new HashMap<>();
        Map.put("A", 1);
        Map.put("B", 2);
        Map.put("C", 3);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMapContainsKey() {
        Assert.assertTrue(Map.containsKey("B"));
    }

    @Test
    public void TestHashMapEmpty() {
        Assert.assertFalse(Map.isEmpty());
    }

    @Test
    public void TestHashMapRemove() {
        Assert.assertTrue(Map.remove("A", 1));
    }

    @Test
    public void TestHashMapReplace() {
        Assert.assertEquals((Integer) 3, Map.replace("C", 4));
    }

    @Test
    public void TestHashMapClear() { Map.clear();
        Assert.assertEquals(true, Map.isEmpty());
    }
}

