 class LinkList{
	Node head;
	class Node{
		String data;
		Node link;
		Node(String data){
			this.data=data;
			this.link=null;
		}
	}
	// add = first
			public void addFirst(String data){
			 Node n1 = new Node (data);
			 if(head == null){
				 head=n1;
				 return;
			 }
			 n1.link=head;
			 head=n1;
		}
	// add = last
	public void addLast(String data){
		Node n1 = new Node (data);
		if(head == null){
			head=n1;
			return;
		}
		Node currentNode = head;
		while ( currentNode.link != null ){
			currentNode = currentNode.link;
		}
		currentNode.link = n1;
	}
	// Print List
		public void  printList(){
			if(head == null){
				System.out.println ("List is Empty");
				return;
			}
			Node currentNode = head;
			while ( currentNode != null ){
				System.out.print (currentNode.data + "->");
				currentNode = currentNode.link;
			}
			System.out.print ("Null");
		}
	}
public class LL{
	public static void main ( String[] args ) {
		LinkList list = new LinkList ();
		list.addFirst ("b");
		list.addFirst ("a");
		list.printList ();
		
		System.out.println ();
		
		list.addLast ("c");
		list.addLast ("d");
		list.printList ();
	}
}
