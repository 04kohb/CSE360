package cse360assign2;
/**
 *    @author       Boon Yeow Koh 
 *    @classID      120
 *    @assignment   1
 *    @description  This program contains methods to create, add, 
 *                  remove, count, and display a list of integers
 */

public class SimpleList 
{
    private int[] list;
    private int count;
    
    //creates a new integer array with 10 elements and 
    //set count to 0
    public SimpleList() 
    {
        list = new int[10];
        count = 0;
    }
    
    //adds a parameter into the list
    public void add(int par) 
    {
        int i;
        if(list == null)
        {
            list[0] = par;
        }
        else
        {
            for(i = count; i > 0; i--)
            {
                list[i]=list[i-1];
            }
            list[0] = par;
        }
        count++;
        
    }
    
    //removes a parameter from the list
    public void remove(int par) 
    {
        int i;
        if(search(par) != -1)
        {
            count--;
            for(i = search(par); i < count; i++)
            {
                list[i]=list[i+1];
            }   
        }
    }
    
    //returns number of elements in the list
    public int count() 
    {
        return count;
    }
    
    // returns a string of the list
    public String toString()
    {
        int i;
        String str = list[0]+"";
      
        for (i = 1; i < count; i++)
        {
           str = str+" "+list[i];
        }
        return str;
    }

    //returns the location of the parameter
    public int search(int par) 
    {
        int i;
        for(i = 0; i < count; i++)
        {
            if(list[i]==par)
            {
                return i;
            }
               
        }
        return -1;
    }
}