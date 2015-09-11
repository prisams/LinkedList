package DoublyLinkedList;

public class ReverseList {
	public static void main(String args[]){
		DoublyLinkedListMethods dllm1 = 
				new DoublyLinkedListMethods();
		System.out.println("Creating first list");
		dllm1.insertLast(10);
		dllm1.insertLast(20);
		dllm1.insertLast(30);
		dllm1.insertLast(40);
		dllm1.insertLast(50);
		dllm1.printList();
		dllm1.reverseList();
		System.out.println("Print rev");
		dllm1.printList();
		//dllm1.printList();
	}
}
