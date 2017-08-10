package functionOfLinkedList;
/**
 *Create an object of LinkedList class and perform the following operations:
    Add elements in the object.
      Traverse the elements of LinkedList in reverse direction
        Join an ArrayList at the end of LinkedList.
           Implement the LinkedList as a Queue(FIFO).
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListFunctions {
	

	public static void main(String[] args) {
		LinkedList<String> alphabet = new LinkedList<String>();

		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		alphabet.add("E");

		System.out.println("LinkedList after adding elements in the object:");
		for (String a : alphabet) {
			System.out.println(a);
		}

		// Creating ListIterator object using listIterator() method.
		ListIterator<String> listobject = alphabet.listIterator(alphabet.size());

		System.out.println("\nTraversing the LinkedList in reverse direction:");
		/*
		 * hasPrevious() method returns true if ListIterator has more elements
		 * to traverse in reverse direction. previous() method returns previous
		 * element in the link list.
		 */

		while (listobject.hasPrevious()) {
			System.out.println(listobject.previous());
		}

		System.out.println("\nAn an ArrayList is joined at the end of LinkedList:");
		// Creating an Array List .
		ArrayList<String> arrayListAlphabet = new ArrayList<String>();
		arrayListAlphabet.add("F");
		arrayListAlphabet.add("G");

		// Creating new LinkedList
		LinkedList<String> join = new LinkedList<String>();
		// Using addAll() method to join ArrayList at the end of the LinkedList.
		join.addAll(alphabet);
		join.addAll(arrayListAlphabet);

		for (String j : join) { // Displaying elements of the joined ArrayList
			System.out.println(j);
		}

		System.out.println("\nImplementing the LinkedList as a Queue:");

		int i; //Declaring variable i to create loop
		for (i = 0; join.size() > i; i--) { //Loop will execute till the length of LinkedList.
			try { // Try statement 
		//removeFrist() method helps LinkedList to perform FIFO function of queue.
	    // It deletes the elements in the order they are added to Linkedlist.
				Object queue = join.removeFirst();//Removes first Element from the top
				System.out.println(queue + " is deleted from the front");
				System.out.println(join); //Prints the new LinkedList
				if (join.isEmpty()) { // If LinkedList Empty
					System.err.println("LinkedList is empty"); //Prints empty list statement
					break;

				}
				
			} /** NoSuchElementException thrown by the nextElement method to indicate 
			      that there are no more elements in the enumeration.
			      **/
			catch (Exception NoSuchElementException) { 

			}

		}

	}
}
