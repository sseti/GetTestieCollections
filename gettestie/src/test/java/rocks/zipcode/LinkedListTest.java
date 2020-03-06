package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    LinkedList<String> list;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new LinkedList<String>();
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestLinkedListGetLast() { Assert.assertEquals("Yellow", list.getLast()); }

    @Test
    public void TestLinkedListContains() { Assert.assertTrue(list.contains("Green")); }

    @Test
    public void TestLinkedListSet() { Assert.assertEquals("Blue", list.set(1,"Red"));}

    @Test
    public void TestLinkedListPeek() { Assert.assertEquals("Green",list.peek()); }

    @Test
    public void TestLinkedListPoll() { Assert.assertEquals("Green",list.poll()); }
}

