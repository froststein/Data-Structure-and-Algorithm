package question2;


public class BookLinkedList {
	// reference to first item in list
		private ListNode pHead;

		// constructor
		public BookLinkedList() {
			pHead = null;
		}

		public void insertFirst(Book value) {
			ListNode newNode = new ListNode(value);
			newNode.next = pHead;
			pHead = newNode;
		}

		public void displayList() {
			System.out.print("Linked List: ");
			ListNode current = pHead; // start of list

			// loop through until end of list

			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next; // move to next link
			}
			System.out.println();
		}

		// This method returns true if list if empty, false
		// otherwise
		public boolean isEmpty() {
			return (pHead == null);
		}

		// This method removes the first node from the linked
		// list and returns the reference to the deleted node.
		public ListNode deleteFirst() {
			ListNode p = null;
			// check if list is not empty
			if (!isEmpty()) {
				p = pHead;
				pHead = pHead.next;
				p.next = null;
			}
			return p;
		}

		// This method searches the linked list for a node
		// with a specified key value and returns a reference
		// to that node
		public ListNode find(Book Key) {
			ListNode p = pHead;
			// if list is empty
			if (p == null)
				return null;

			while (p.data != Key) {
				if (p.next == null) // if end of list
					return null; // not found
				else
					p = p.next;
			}
			return p; // find it
		}

		// This method will first search the linked list
		// for the node with a specified key value, using
		// the find method, and insert a new node with
		// the given value.
		public ListNode insertAfter(Book key, Book value) {
			ListNode p = find(key);
			// if list is empty or key not found,
			// insert fail
			if (p == null)
				return null;
			ListNode newNode = new ListNode(value);
			newNode.next = p.next;
			p.next = newNode;
			return newNode;
		}

		// This method deletes the node from the linked
		// link with the specified key value.
		public ListNode delete(Book key) {
			ListNode curr = pHead;
			ListNode prev = pHead;

			if (curr == null) // if list is empty
				return null;

			while (curr.data != key) {
				if (curr.next == null) // if end of list
					return null; // not found
				else {
					prev = curr;
					curr = curr.next;
				}
			}
			// find it
			if (curr == pHead) // if the first node
				pHead = pHead.next;
			else
				prev.next = curr.next;
			// set the next ref to null
			curr.next = null;
			return curr;
		}
		
		
		public void insertInOrder(Book value) {
			ListNode current = pHead;
			// Do if LL is empty
			if (pHead == null) {
				insertFirst(value);
				return;
			}
			
			while (current != null) {
				System.out.println(current.data.toString() + " vs " + value.toString() + " = " + current.data.compareTo(value));
				if (current.next != null) {
					if (current.data.compareTo(value) > 0 && value.compareTo(current.next.data) > 0) {
						insertAfter(current.data, value);
						return;
					} else if (current.data.compareTo(value) < 0) {
						insertFirst(value);
						return;
					}
					current = current.next;
				} else {
					insertAfter(current.data, value);
					return;
				}

			}

	}
}
