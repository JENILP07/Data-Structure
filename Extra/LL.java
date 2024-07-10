class LinkList {
	Node head;

	class Node {
		String data;
		Node link;

		Node(String data) {
			this.data = data;
			this.link = null;
		}
	}

	// add = first
	public void addFirst(String data) {
		Node n1 = new Node(data);
		if (head == null) {
			head = n1;
			return;
		}
		n1.link = head;
		head = n1;
	}

	// add = last
	public void addLast(String data) {
		Node n1 = new Node(data);
		if (head == null) {
			head = n1;
			return;
		}
		Node currentNode = head;
		while (currentNode.link != null) {
			currentNode = currentNode.link;
		}
		currentNode.link = n1;
	}

	// Print List
	public void printList() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.link;
		}
		System.out.print("Null");
	}

	// Remove First
	public void removeFirst() {
		if (head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		head = this.head.link;

	}

	// Remove Last
	public void removeLast() {
		if (head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		if (head.link == null) { // if the list cointains only one node then make the only node null and delete
									// it
			head = null;
			return;
		}
		Node currNode = head;
		Node lastNode = head.link;
		while (lastNode.link != null) {
			currNode = currNode.link;
			lastNode = lastNode.link;
		}

		currNode.link = null;
	}

	//remove given node from data

	public void removeNode(String data) {
		if (head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		Node currNode = head;
		Node prevNode = null;
		while (currNode.data != data && currNode != null ) {
			prevNode = currNode;
			currNode = currNode.link;
			}
			if (currNode.data != data) {
				System.out.println("Node not found");
				return;
			} else if(head.data == data){
				head = head.link;
			}else{
				prevNode.link = currNode.link;
			}
		}
	}



public class LL {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();

		System.out.println();

		list.addLast("List");
		list.printList();

		System.out.println();

		list.addFirst("This");
		list.printList();

		System.out.println();

		list.removeFirst();
		list.printList();

		System.out.println();

		list.removeNode("List");
		list.printList();
	}
}
