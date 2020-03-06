package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    private Stack<String> stack;

    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Assert.assertEquals(false, stack.isEmpty());
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestStackPeek() { Assert.assertEquals("C", stack.peek()); }

    @Test
    public void TestStackEmpty() {
        Stack<String> stack = new Stack<>();
        Assert.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void TestStackSearch() {
        stack.push("D");
        stack.push("E");
        Assert.assertEquals(1, stack.search("E"));
    }

}
