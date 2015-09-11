package DoublyLinkedList;

import QueueWithArray.QueueEmptyException;

public interface DoublyLinkedListInterface {
	public void insertFirst(Object elemenet);
	public void insertLast(Object elemenet);
	public void removeFirst() throws QueueEmptyException;
	public void removeLast() throws QueueEmptyException;
	public boolean isEmpty();
	public Object front() throws QueueEmptyException;
	public Object tail() throws QueueEmptyException;
	public int size();
	public void removeAt(int position) throws QueueEmptyException;
	public void insertAt(int position,Object element);
	public void printList();
	public void reversePrint();
	}