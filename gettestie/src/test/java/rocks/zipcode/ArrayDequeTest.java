package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

    public Deque<String> dq;

    @org.junit.Before
    public void setUp() throws Exception {
        dq = new ArrayDeque<String>();
        dq.add("Apple");
        dq.add("Banana");
        dq.add("Grapes");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestArrayDequeEmpty() { Assert.assertEquals(false, dq.isEmpty()); }

    @Test
    public void TestArrayDequePeekFirst() { Assert.assertEquals("Apple", dq.peekFirst()); }

    @Test
    public void TestArrayDequeElement() { Assert.assertEquals("Apple", dq.element()); }

    @Test
    public void TestArrayDequeSize() { Assert.assertEquals(3, dq.size()); }

    @Test
    public void TestArrayDequeRemoveLastOcc(){
        dq.removeLastOccurrence("Grapes");
        Deque<String> result = dq;
        Assert.assertEquals(dq, result);
    }

}

