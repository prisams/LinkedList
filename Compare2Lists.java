package DoublyLinkedList;

public class Compare2Lists {
	public static void main(String args[]){
		DoublyLinkedListMethods dllm1 = 
				new DoublyLinkedListMethods();
		DoublyLinkedListMethods dllm2 = 
				new DoublyLinkedListMethods();
		System.out.println("Creating first list");
		dllm1.insertLast(10);
		dllm1.insertLast(20);
		dllm1.insertLast(30);
		dllm1.insertLast(40);
		dllm1.insertLast(50);
		dllm1.printList();
		
		System.out.println("Creating second list");
		dllm2.insertLast(100);
		dllm2.insertLast(200);
		dllm2.insertLast(300);
		dllm2.insertLast(400);
		dllm2.insertLast(500);
		dllm2.printList();
		
		
		
	}
}
