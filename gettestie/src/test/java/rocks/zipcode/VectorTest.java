package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
        private Vector v;
        private Vector v_clone;

        @org.junit.Before
        public void setUp() throws Exception {
            v = new Vector();
            v_clone = new Vector();
        }

        @org.junit.After
        public void tearDown() throws Exception { }

        @org.junit.Test
        public void TestVectorAdd() {
            v.add("A");
            Assert.assertTrue(v.contains("A"));
        }

        @Test
        public void TestVectorClear() {
            v.clear();
            Assert.assertTrue(v.isEmpty());
        }

        @Test
        public void TestVectorClone(){
            v_clone = (Vector)v.clone();
            Assert.assertEquals(true, v.equals(v_clone));
        }

        @Test
        public void TestVectorGet(){
            Vector v = new Vector();
            v.add("A");
            v.add("B");
            v.add("C");
            Assert.assertEquals("C", v.get(2));
        }
        @Test
        public void TestVectorLastIndex(){
            Vector v = new Vector();
            v.add("A");
            v.add("B");
            v.add("C");
            Assert.assertEquals(2, v.lastIndexOf("C"));
        }

    }

