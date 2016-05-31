package question1;

// Sample code for creating and printing the linked list.
public class TestLinkedList{
	public static void main (String argv[]){
		LinkedList l1=new LinkedList();
		l1.insertFirst(1);
		l1.insertFirst(2);
		l1.insertFirst(3);
		l1.insertFirst(4);
		l1.insertFirst(5);
		l1.insertFirst(6);
		l1.insertFirst(7);
		l1.insertFirst(8);
		l1.insertFirst(9);
		l1.insertFirst(10);
		l1.displayList();
		
		l1.deleteFirst();
		System.out.println("Deleted node: 10");
		
		nodeFinder(l1, 5);
		nodeFinder(l1, 20);
		
		System.out.println("\nBefore inserting ... ");
		l1.displayList();
		l1.insertAfter(5, 20);
		System.out.println("Node inserted: 20");
		System.out.println("After inserting ... ");
		l1.displayList();
		System.out.println("\nBefore inserting ... ");
		l1.displayList();
		l1.delete(5);
		System.out.println("Node deleted: 5");
		System.out.println("After inserting ... ");
		l1.displayList();
	}
	public static void nodeFinder(LinkedList l1,int index){
		if(l1.find(index)!=null){
			System.out.println("Found node: "+index);
		}
		else{
			System.out.println("No such node: "+index);
		}
	}
}
