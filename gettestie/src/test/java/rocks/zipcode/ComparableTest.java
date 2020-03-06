package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {

    @org.junit.Before
    public void setUp() throws Exception { }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestComparable() {
        String s1 = "Earth";
        String s2 = "Earthquake";
        Assert.assertEquals(-5, s1.compareTo(s2));
    }
}

