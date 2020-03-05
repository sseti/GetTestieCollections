package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    private ArrayList<String> array;

    @org.junit.Before
    public void setUp() throws Exception {
        array = new ArrayList<>();
        array.add("Bird");
        array.add("Elephant");
        array.add("Rhinoceros");
        array.add("pig");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @org.junit.Test
    public void TestArrayListGetIndex() { Assert.assertEquals("Bird", array.get(0)); }

    @Test
    public void TestArrayListContains1() { Assert.assertEquals(true, array.contains("Bird")); }

    @Test
    public void TestArrayListContains2() { Assert.assertEquals(false, array.contains("Ants")); }

    @Test
    public void TestArrayListSubList() {
        List<String> arrayList2 = array.subList(1, 3);
        Assert.assertEquals(array.get(2), arrayList2.get(1));
    }

    @Test
    public void TestArrayListRemove() { Assert.assertEquals(true, array.remove("Elephant")); }

    @Test
    public void TestArrayListAddAll() {
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Duck");
        arrayList2.add("Dog");
        arrayList2.add("Cat");
        Assert.assertEquals(true, array.addAll(arrayList2));
    }

    @Test
    public void TestArrayListReverse() {
        Collections.reverse(array);
        Assert.assertEquals(array.subList(0,4), array);
    }
}

