/**
 * 
 */
package textgen;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author UC San Diego MOOC team
 *
 */
public class MyLinkedListTester {

	private static final int LONG_LIST_LENGTH =100;

	MyLinkedList<String> shortList;
	MyLinkedList<Integer> emptyList;
	MyLinkedList<Integer> longerList;
	MyLinkedList<Integer> list1;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Feel free to use these lists, or add your own
	    shortList = new MyLinkedList<String>();
		shortList.add("A");
		shortList.add("B");
		emptyList = new MyLinkedList<Integer>();
		longerList = new MyLinkedList<Integer>();
		for (int i = 0; i < LONG_LIST_LENGTH; i++)
		{
			longerList.add(i);
		}
		list1 = new MyLinkedList<Integer>();
		list1.add(65);
		list1.add(21);
		list1.add(42);
		
	}

	
	/** Test if the get method is working correctly.
	 */
	/*You should not need to add much to this method.
	 * We provide it as an example of a thorough test. */
	@Test
	public void testGet() {
		//test empty list, get should throw an exception
		try {
			emptyList.get(0);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
			
		}
		
		// test short list, first contents, then out of bounds
		assertEquals("Check first", "A", shortList.get(0));
		assertEquals("Check second", "B", shortList.get(1));
		
		try {
			shortList.get(-1);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			shortList.get(2);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		// test longer list contents
		for(int i = 0; i<LONG_LIST_LENGTH; i++ ) {
			assertEquals("Check "+i+ " element", (Integer)i, longerList.get(i));
		}
		
		// test off the end of the longer array
		try {
			longerList.get(-1);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			longerList.get(LONG_LIST_LENGTH);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		}

	}
	
	
	/** Test removing an element from the list.
	 * We've included the example from the concept challenge.
	 * You will want to add more tests.  */
	@Test
	public void testRemove() {
		/*
		for(int node : list1){
			System.out.println(node);
		}
		*/
		int a = list1.remove(0);
		assertEquals("Remove: check a is correct ", 65, a);
		assertEquals("Remove: check element 0 is correct ", (Integer)21, list1.get(0));
		assertEquals("Remove: check size is correct ", 2, list1.size());
		
		// TODO: Add more tests here
	}
	
	/** Test adding an element into the end of the list, specifically
	 *  public boolean add(E element)
	 * */
	@Test
	public void testAddEnd() {
        // TODO: implement this test
        longerList.add(101);
        int size = LONG_LIST_LENGTH + 1;
        assertEquals("Size: check longerlist's size is correct ", size, longerList.size());
        assertEquals("Data: check longerlist's data is correct ", new Integer(101), longerList.get(size-1));
	}

	
	/** Test the size of the list */
	@Test
	public void testSize() {
		// TODO: implement this test
        assertEquals("Size: check longerlist's size is correct ", LONG_LIST_LENGTH, longerList.size());
        assertEquals("Size: check emptylist's size is correct ", 0, emptyList.size());
        assertEquals("Size: check shortlist's size is correct ", 2, shortList.size());
	}

	
	
	/** Test adding an element into the list at a specified index,
	 * specifically:
	 * public void add(int index, E element)
	 * */
	@Test
	public void testAddAtIndex() {
        // TODO: implement this test
		longerList.add(LONG_LIST_LENGTH, 102);
        int size = 1 + LONG_LIST_LENGTH;
        assertEquals("Size: check longerlist's size is correct ", size, longerList.size());
        assertEquals("Data: check longerlist's data is correct ", new Integer(102), longerList.get(size-1));

	}
	
	/** Test setting an element in the list */
	@Test
	public void testSet() {
	    // TODO: implement this test
	    longerList.set(99, 888);
        assertEquals("Size: check longerlist's size is correct ", LONG_LIST_LENGTH, longerList.size());
        assertEquals("Data: check longerlist's data is correct ", new Integer(888), longerList.get(99));


        longerList.set(0, 888);
        assertEquals("Size: check longerlist's size is correct ", LONG_LIST_LENGTH, longerList.size());
        assertEquals("Data: check longerlist's data is correct ", new Integer(888), longerList.get(0));


        longerList.set(LONG_LIST_LENGTH-1, 888);
        assertEquals("Size: check longerlist's size is correct ", LONG_LIST_LENGTH, longerList.size());
        assertEquals("Data: check longerlist's data is correct ", new Integer(888), longerList.get(LONG_LIST_LENGTH-1));

        try{
            longerList.set(-1, 888);
            fail("Boundary Test: adding before the head");
        }
        catch (Exception e){

        }

        try{
            longerList.set(LONG_LIST_LENGTH, 888);
            fail("Boundary Test: adding before the head");
        }
        catch (Exception e){

        }
	}
	
	
	// TODO: Optionally add more test methods.
	
}
