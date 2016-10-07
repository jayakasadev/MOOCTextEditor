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
            head.next = tail;
            tail = new LLNode<E>(null);
            tail.prev = head;
        }
        else{
            //adding at the end
            //getting tail's parent
            LLNode<E> prev = tail.prev;

            //create new node to add
            LLNode<E> node = new LLNode<E>(element);
            //set child to tail
            node.next = tail;
            //set parent
            node.prev = prev;

            //set the tail's parent to new node
            tail.prev = node;
            //set child of parent node
            prev.next = node;
        }
        size++;
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) {
		// TODO: Implement this method.
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        LLNode<E> temp = head;
        while(index > 0){
            temp = temp.next;
            index--;
        }
		return temp.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) {
		// TODO: Implement this method
        if(index <= size && index >= 0){
            LLNode<E> node = new LLNode<E>(element);
            LLNode<E> temp = head;
            while(index > 0){
                temp = temp.next;
                index--;
            }

            LLNode<E> prev= temp.prev;
            node.next = temp;
            node.prev = prev;

            temp.prev = node;
            prev.next = node;
        }
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
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        LLNode<E> temp = head;
        E data = null;

        if(index == 0){
            data = head.data;
            head = head.next;
            head.prev = null;
        }
        else if(index == size-1){
            data = tail.data;
        }
        else {
            while(index > 1){
                temp = temp.next;
                index--;
            }

            LLNode<E> target = temp.next;
            LLNode<E> child = target.next;

            data = temp.data;

            temp.next = child;
            child.prev = temp;

            target = null;
        }

        size--;

		return data;
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
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        LLNode<E> temp = head;

        while(index > 0){
            temp = temp.next;
            index--;
        }

        temp.data = element;

		return temp.data;
	}   
}

class LLNode<E> {
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) {
		this.data = e;
	}
}
