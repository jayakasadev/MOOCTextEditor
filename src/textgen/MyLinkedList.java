package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) {
		// TODO: Implement this method
        if(head == null){
            head = new LLNode<E>(element);
            head.setNext(tail);
            return true;
        }
        if(tail == null){
            tail = new LLNode<E>(element);
            return true;
        }
        LLNode<E> node = tail;
        while(node.getNext() != null){
            node = node.getNext();
        }
        node.setNext(new LLNode<E>(element));
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) {
		// TODO: Implement this method.
		return null;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) {
		// TODO: Implement this method

	}


	/** Return the size of the list */
	public int size() {
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) {
		// TODO: Implement this method
		return null;
	}   
}

class LLNode<E> {
	private LLNode<E> prev;
	private LLNode<E> next;
	private E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

	public LLNode<E> getPrev(){
        return prev;
    }

    public LLNode<E> getNext(){
        return next;
    }

    public void setPrev(LLNode<E> prev){
        this.prev = prev;
    }

    public void setNext(LLNode<E> next){
        this.next = next;
    }

    public E getData(){
        return data;
    }
}
