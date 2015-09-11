package DoublyLinkedList;

public class PrintListReverse {
	public static void main(String args[]){
		DoublyLinkedListMethods dllm =
				new DoublyLinkedListMethods();
		dllm.insertLast(10);
		dllm.insertLast(20);
		dllm.insertLast(30);
		dllm.insertLast(40);
		dllm.insertLast(50);
		System.out.println("Linked List created");
		dllm.printList();
		System.out.println("Reversed List:");
		dllm.reversePrint();
	}
}
