package DoublyLinkedList;
import QueueWithArray.QueueEmptyException;

public class DoublyLinkedListMethods implements DoublyLinkedListInterface {
	Node head,tail;
	int size=0;
	
	public DoublyLinkedListMethods(){
		head=new Node (null,null,null);
		tail=new Node (null,null,null);
	}
	@Override
	public void insertFirst(Object element) {
		Node newNode= new Node(element,null,null);
		if(size==0){
			head=newNode;
			tail=newNode;
		}
		else{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			
		}
		System.out.println("Inserted at front");
		size++;
	}

	@Override
	public void insertLast(Object element) {
		Node newNode = new Node(element,null,null);
		if (size()==0){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		System.out.println("Inserted at last");
		size++;
	}

	@Override
	public void removeFirst() throws QueueEmptyException {
		if (size()==0){
			throw new QueueEmptyException("message");
		}
		else{
			Node temp=head;
			head=head.next;
			temp=null;
		}
		System.out.println("Removed from first");
		size--;
	}

	@Override
	public void removeLast() throws QueueEmptyException {
		if (size()==0){
			throw new QueueEmptyException("message");
		}
		else{
			Node temp=tail;
			tail=tail.prev;
			temp=null;
		}
		//System.out.println("Removed from last");
		size--;
	}

	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	@Override
	public Object front() throws QueueEmptyException {
		if (size()==0){
			throw new QueueEmptyException("message");
		}
		else{
			return head.element;
		}
	}

	@Override
	public Object tail() throws QueueEmptyException {
		if (size()==0){
			throw new QueueEmptyException("message");
		}
		else{
			return tail.element;
		}
	}

	@Override
	public int size() {
		return size;
	}
	@Override
	public void removeAt(int position) throws QueueEmptyException {
		Node todelete = null;;
		if ((size==0) || (position>size-1)){
			System.out.println("Boundary Violation");
		}
		else{
			int mid=size()/2;
			if (position<mid){
				int i=0;
				todelete=head;
				while(i!=position){
					todelete=todelete.next;
					i++;
				}
			}
			else{
				int i=size()-1;
				todelete=tail;
				while(i!=position){
					todelete=tail.prev;
					i--;
				}
			}
		}
		System.out.println("The element is: " + todelete.element);
		if (position==0){;
			//head=todelete.next;
			//head.prev=null;
			//todelete=null;
			removeFirst();
		}
		else if (position==size-1){
			System.out.println("tail removal");
			//tail=todelete.prev;
			//tail.next=null;
			//todelete=null;
			removeLast();
			}
		else {
			System.out.println("else");
			todelete.prev.next=todelete.next;
			todelete.next.prev=todelete.prev;
			todelete=null;
			size--;
			}
		System.out.println("Deleted");
		
	}
	@Override
	public void insertAt(int position,Object element) {
		if (position==0){
			insertFirst(element);
		}
		else if (position==(size()-1)){
			insertLast(element);
		}
		else{
			Node toinsert=null;
			int mid=size()/2;
			if (position<mid){
				int i=0;
				toinsert=head;
				while(i!=position-1){
					toinsert=toinsert.next;
					i++;
				}
			}
			else{
				int i=size()-1;
				toinsert=tail;
				while(i!=position-1){
					toinsert=tail.prev;
					i--;
				}
			}
			System.out.println("element:" + toinsert.element);
			Node newNode= new Node(element,toinsert,
					toinsert.next);
			toinsert.next=newNode;
			toinsert.next.next=newNode.next;
			System.out.println("new: "+ newNode.element);
			System.out.println("new prev:"+ newNode.prev.element);
			System.out.println("new next:" +newNode.next.element);
			size++;
		}
		
	}
	public void printList(){
		Node temp=head;
		while(temp.next!=null){
			System.out.print(temp.element + " ");
			temp=temp.next;
		}
		System.out.print(temp.element);
		System.out.println();
	}
	
	public void reversePrint(){
		Node temp=tail;
		while(temp.prev!=null){
			System.out.print(temp.element + " ");
			temp=temp.prev;
		}
		System.out.print(temp.element);
	}
	
	public void reverseList(){
		System.out.println("Reversing List");
		int i=0;
		Node tempHead=head;
		Node tempTail=tail;
		System.out.println("tempHead:"+ tempHead.element);
		System.out.println("tempTail:"+ tempTail.element);
		while(i<2){
			System.out.println("In while: " + i);
			Object temp=head.element;
			System.out.println("temp: " + temp);
			head.element=tail.element;
			tail.element=temp;
			head=head.next;
			tail=tail.prev;
			i++;
		}
		head=tempHead;
		tail=tempTail;
		System.out.println("Head: " + head.element);
		System.out.println("Done");
	}
}
