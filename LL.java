import java.util.*;
class LL{
	public static void main(String[] args) {
		//Array List has a fixed size whereas as LL has not 
		System.out.println("Array List has a Unknown size whereas as LL has not defined where it will store");
		ArrayList al  = new ArrayList();
		System.out.println("The size of array List is"+al.size());
		LinkedList ll = new LinkedList();
		System.out.println("The size of Linked  List is"+ll.size());

		System.out.println("Array List is best suited for storing data  as LL has memory location undedefined");

		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);

		System.out.println("Array List tarverse the whole list thats why searching is poor where in LL the searching is good and fast");




		ll.add(2);
		ll.add(2);
		ll.add(2);
		ll.add(2);
		ll.add(2);
		ll.add(2);

		System.out.println("ArrayList class implements a List interface. Therefore, this acts as a list"+"whereas This class implements both the List interface and the Deque interface. Therefore, it can act as a list and a deque.");





	}
}