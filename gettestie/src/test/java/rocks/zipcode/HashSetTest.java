package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {

    HashSet<String> set = new HashSet<String>();

    @org.junit.Before
    public void setUp() throws Exception {
        set.add("Cat");
        set.add("Dog");
        set.add("Elephant");
        set.add("Bird");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestHashSetRemove() { Assert.assertTrue(set.remove("Dog")); }

    @Test
    public void TestHashSetSize() { Assert.assertEquals(4, set.size()); }

    @Test
    public void TestHashSetEmpty() { Assert.assertFalse(set.isEmpty()); }

    @Test
    public void TestHashSetContains() { Assert.assertTrue(set.contains("Dog")); }

    @Test
    public void TestHashSetEquals() {
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Cat");
        set2.add("Dog");
        set2.add("Bird");
        set2.add("Elephant");
        Assert.assertTrue(set.equals(set2));
    }
}

