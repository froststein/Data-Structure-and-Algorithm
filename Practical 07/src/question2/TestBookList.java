package question2;

public class TestBookList {
	public static void main(String[] args) {
		System.out.println("--------- Question 2 --------");
		BookLinkedList list = new BookLinkedList();
		ListNode p;
		Book john = new Book("1234", "John");
		Book eric = new Book("5678", "Eric");
		Book phoon = new Book("9999", "Phoon");

		list.insertFirst(john);
		list.insertFirst(eric);

		list.displayList(); // Print the contents

		p = list.find(phoon);
		if (p != null)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		System.out.println("==============================");
		BookLinkedList list3 = new BookLinkedList();
		Book john2 = new Book("1234", "John");
		Book eric2 = new Book("5678", "Eric");
		Book fred2 = new Book("1111", "Fred");
		Book ang2 = new Book("5555", "Ang");
		Book phoon2 = new Book("9999", "Phoon");
		
		list3.insertInOrder(john2);
		System.out.println("John added");
		list3.insertInOrder(eric2);
		System.out.println("Eric added");
		list3.insertInOrder(fred2);
		System.out.println("Fred added");
		list3.insertInOrder(ang2);
		System.out.println("Ang added");
		list3.insertInOrder(phoon2);
		System.out.println("Phoon added");

		list3.displayList();
	}
}
