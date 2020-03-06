package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class PriorityQueueTest {

    LinkedList<String> list;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Durian");
        list.add("Grapes");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestPriorityQueueOffer(){ Assert.assertTrue(list.offer("Cherry")); }

    @Test
    public void TestPriorityQueuePeek() { Assert.assertEquals("Apple",list.peek()); }

    @Test
    public void TestPriorityQueueContains() { Assert.assertTrue(list.contains("Grapes")); }

    @Test
    public void TestPriorityQueueSize() { Assert.assertEquals(5,list.size()); }

    @Test
    public void TestPriorityQueuePollLast() { Assert.assertEquals("Grapes",list.pollLast()); }
}
