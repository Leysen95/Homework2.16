package me.skypro.Homework_2._6.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IntegerArrayListTest {

    private IntegerArrayList list;

    @BeforeEach
    public void setUp() {
        list = new IntegerArrayList(10);
    }

    @Test
    public void addTest() {
        assertEquals(Integer.valueOf(1), list.add(1));
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
    }

    @Test
    public void testAddAtIndex() {
        list.add(1);
        list.add(0, 2);
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(2), list.get(0));
        assertEquals(Integer.valueOf(1), list.get(1));
    }

    @Test
    public void addInvalidationIndex() {
        list.add(0,1);
    }

    @Test
    public void setTest() {
        list.add(1);
        list.set(0, 2);
        assertEquals(Integer.valueOf(2), list.get(0));
    }

    @Test
    public void setAtInvalidIndexTest(){
        list.set(0,1);
    }

    @Test
    public void removeByValueTest() {
        list.add(1);
        list.add(2);
        assertEquals(Integer.valueOf(1), list.remove(Integer.valueOf(1)));
        assertFalse(list.contains(1));
        assertEquals(1, list.size());
    }

    @Test
    public void removeByIndexTest() {
        list.add(1);
        list.add(2);
        assertEquals(Integer.valueOf(1), list.remove(0));
        assertFalse(list.contains(1));
        assertEquals(1, list.size());
    }


    @Test
    public void containsTest() {
        list.add(1);
        assertTrue(list.contains(1));
        assertFalse(list.contains(2));
    }

    @Test
    public void indexOfTest() {
        int target = 87;
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(target);

        int index = list.indexOf(target);
        assertNotEquals(index, -1);
    }

    @Test
    public void lastIndexOfTest() {
        list.add(1);
        list.add(2);
        list.add(1);
        assertEquals(2, list.lastIndexOf(1));
        assertEquals(-1, list.lastIndexOf(3));
    }

    @Test
    public void getTest() {
        list.add(1);
        assertEquals(Integer.valueOf(1), list.get(0));
    }

    @Test
    public void testEquals() {
        IntegerArrayList anotherList = new IntegerArrayList(10);
        anotherList.add(1);
        anotherList.add(2);
        list.add(1);
        list.add(2);
        assertTrue(list.equals(anotherList));

        anotherList.add(3);
        assertFalse(list.equals(anotherList));
    }

    @Test
    public void sizeTest() {
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
    }

    @Test
    public void isEmptyTest() {
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void clearTest() {
        list.add(1);
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void toArrayTest() {
        list.add(1);
        list.add(2);
        Integer[] expectedArray = { 1, 2 };
        assertArrayEquals(expectedArray, list.toArray());
    }

    @Test
    void testToString() {
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] expectedArray = {1, 2, 3};
        assertEquals(expectedArray, list.toArray());
    }
}