package DoublyLinkedList;

public class DoublyLinkedList {
	public static void main(String args[]){
		DoublyLinkedListMethods dllm = new DoublyLinkedListMethods();
		try{
			dllm.insertFirst(100);
			dllm.insertLast(200);
			dllm.removeFirst();
			dllm.insertLast(45);
			dllm.insertLast(49);
			dllm.insertAt(0, 13);
			//dllm.removeFirst();
			//dllm.removeFirst();
			//dllm.insertFirst(4000);
			//dllm.removeAt(0);

			dllm.insertAt(1, 7);
			dllm.removeFirst();
			System.out.println("Size-----: " + dllm.size());
			//dllm.removeAt(2);
			System.out.println("Size: " + dllm.size());
			System.out.println("Head: " +dllm.front());
			System.out.println("Tail: " +dllm.tail());
			
		}
		catch(Exception e){
		}
	}
}
