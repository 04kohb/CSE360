/**
 *    @author       Boon Yeow Koh 
 *    @classID      120
 *    @assignment   1
 *    @description  This program tests each method of the SimpleList
 *                  file for both success and fail cases.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

    @Test
    //checks if count is 0
    void testSimpleList() {
        SimpleList list = new SimpleList();
        int output = list.count();
        assertEquals(0, output);
    }
    
    @Test
    /*checks if list exists*/
    void testSimpleList1() {
        SimpleList list = new SimpleList();
        assertNotNull(list);
    }
    
    @Test
    //checks if SimpleList list does not exists. Fails if list exists
    void testfailSimpleList1() {
        SimpleList list = new SimpleList();
        assertNull(list);
    }
    @Test
    //check if add method returns list
    void testAdd() {
        SimpleList list = new SimpleList();
        list.add(3);
        list.add(0);
        list.add(1);
        String output = list.toString();
        assertEquals("1 0 3",output);
    }
    @Test
    //checks if add method does not return a string. Fails if string 
    //exists
    void testFailAdd() {
        SimpleList list = new SimpleList();
        list.add(3);
        list.add(0);
        list.add(1);
        String output = list.toString();
        assertNull(list);
    }

    @Test
    //checks if remove methods removes an element from list
    void testRemoveShouldRemoveNumberFromList() {
        SimpleList list = new SimpleList();
        list.add(3);
        list.add(0);
        list.add(1);
        list.remove(0);
        String output = list.toString();
        assertEquals("1 3",output);
    }
    
    @Test
    //checks if element if not removes from the list. Fails if
    //element is removed
    void testFailRemove() {
        SimpleList list = new SimpleList();
        list.add(3);
        list.add(0);
        list.add(1);
        list.remove(0);
        String output = list.toString();
        assertEquals("1 0 3",output);
    }


    @Test
    //returns the number of elements in the list
    void testCountShouldReturnNumberOfListElements() {
        SimpleList list = new SimpleList();
        list.add(3);
        list.add(0);
        list.add(1);
        int output = list.count();
        assertEquals(3, output);
    }

    @Test
    //checks if count is not counting. Fails if count is counting
    void testFailCount() {
        SimpleList list = new SimpleList();
        list.add(3);
        list.add(0);
        list.add(1);
        int output = list.count();
        assertEquals(0, output);
    }

    @Test
    //checks if toString method returns number of Strings
    void testToStringShouldReturnStringofNumbers() {
        SimpleList list = new SimpleList();
        list.add(1);
        list.add(2);
        String output = list.toString();
        assertEquals("2 1",output);
    }
    
    @Test
    //checks if toString does not return a string. Fails if
    //a string exists
    void testFailtoStringCheckififStringDoesNotExists() {
        SimpleList list = new SimpleList();
        list.add(1);
        list.add(2);
        String output = list.toString();
        assertNull(output);
    }

    @Test
    // returns the location of the element in the list
    void testSearch() {
        SimpleList list = new SimpleList();
        list.add(2);
        list.add(0);
        list.add(1);
        int output = list.search(2);
        assertEquals(2, output);;
    }
    
    @Test
    //checks if search method cannot find element. Fails if it finds it
    void testFailSearch() {
        SimpleList list = new SimpleList();
        list.add(2);
        list.add(0);
        list.add(1);
        int output = list.search(2);
        assertEquals(-1, output);;
    }
    

}
