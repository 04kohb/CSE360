package cse360assign2;
/**
 *    @author       Boon Yeow Koh 
 *    @classID      120
 *    @assignment   2
 *    @description  This program contains methods to create, add, 
 *                  remove, count, get first, last element, and 
 *                  display a list of integers
 *    @link         https://github.com/04kohb/CSE360/tree/master/SimpleList/src/cse360assign2
 */

public class SimpleList {
    private int[] list, list1;
    private int count, num;
    
    /* Creates a new integer array with 10 elements and 
     * set count to 0.
     */
    public SimpleList() {
        list = new int[10];
        count = 0;
    }
    
    /* Adds a parameter into the list.
     * Increase array size by 50% of array
     * is full.
     */
    public void add(int par) {
        if(count == list.length) {
            list1 = new int[list.length / 2 + list.length];
            
            for(num = 0; num < count; num++)
            {
                list1[num] = list[num];
            }
            list = list1;
        }
        
        
        if(isEmpty() == true) {
            list[0] = par;
        }
        else {
            for(num = count; num > 0; num--) {
                list[num] = list[num-1];
            }
            list[0] = par;
        }
        count++;
        
    }
    
    /* Removes a parameter from the list.
     * Reduces the array size by 25% if then is at least 25%
     * of empty space in the array
     */
    public void remove(int par) {
        if(list.length - count > list.length/4) {
            list1 = new int[list.length-list.length/4];
            
            for(num = 0; num < count; num++) {
                list1[num] = list[num];
            }
            list = list1;
        }
        
        if(search(par) != -1) {
            count--;
            
            for(num = search(par); num < count; num++) {
                list[num] = list[num+1];
            }   
        }
    }
    
    //Returns number of elements in the list
    public int count() {
        return count;
    }
    
    //Returns a string of the list
    public String toString() {
        String str = list[0] + "";
      
        for (num = 1; num < count; num++) {
           str = str + " "+ list[num];
        }
        return str;
    }

    /* returns the location of the parameter
     * returns -1 is parameter does not exist
     */
    public int search(int par)  {
        for(num = 0; num < count; num++) {
            if(list[num] == par) {
                return num;
            }
        }
        return -1;
    }
    
    /*Adds parameter to the end of the array
    *Increases array size by 50% if array is full
    */
    public void append(int par) {
        if(count == list.length) {
            list1 = new int[list.length / 2 + list.length];
            
            for(num = 0; num < count; num++) {
                list1[num] = list[num];
            }
            list = list1;
        }
        
        if(isEmpty() == true) {
            list[0] = par;
        }
        else {
            list[count] = par;
        }
        count++;
    }
    
    /*Returns first element in the array
    *Returns -1 if array is empty
    */
    public int first() {
        if(isEmpty() == false) {
            return list[0];
        }
        else
            return -1;
        
    }
    
    /*Returns last element of array
    *Returns -1 if array is empty
    */
    public int last() {
        if(isEmpty() == true) {
            return -1;
        }
        else
            return list[count - 1];
        
    }
    
    //returns the size of the current array
    public int size() {
        return list.length;
    }
    
    /*checks if array is empty. Returns false
    *if array is not empty, else returns true.
    */
    public boolean isEmpty() {
        for(num = 0; num < count; num++) {
            if(list[num] != 0) {
                return false;
            }
        }
        return true;
    }
}