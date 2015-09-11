package DoublyLinkedList;
import java.util.*;

public class reverseWordWithStack {
	public static void main(String args[]){
		DoublyLinkedListMethods dllm = new DoublyLinkedListMethods();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word=scan.next();
		for (int i=0;i<word.length();i++){
			dllm.insertLast(word.charAt(i));
		}
		System.out.println("Size: " + dllm.size());
		scan.close();
		System.out.println("The reverse word:");
		try{
			for (int i=0;i<word.length();i++){
				System.out.print(dllm.tail());
				dllm.removeLast();
			}
		}
		catch(Exception e){
			
		}
	}
}
