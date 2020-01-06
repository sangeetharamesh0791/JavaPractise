/**
 * 
 */

/**
 * @author acer
 *
 */
public class LinkedListExample {	
	public LinkedListExample() {
		head=null;
	}




	public LinkedListExample(Node head) {
		super();
		this.head = head;
	}




	private Node head;
	private class Node {
	int value;
	Node next;
}

	
	public void push(int value){
		
		Node presentHead=head;
		Node newNode= new Node();
		newNode.value=value;
		if(presentHead==null){
			
			
			newNode.next=null;
			head=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
	}
	public void pop(){
		
		Node PresentHead= head;
		if(PresentHead!=null)
		{
			System.out.println(PresentHead.value);
			head=head.next;
		}else{
			System.out.println("Head is Empty.Cant Pop");
		}
		
		
		
	}
	public void print(){
		Node PresentHead=head;
		while(PresentHead!=null){
			System.out.print("\t "+PresentHead.value);
			PresentHead=PresentHead.next;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedListExample lnk= new LinkedListExample();
		lnk.push(1);
		lnk.push(2);
		lnk.push(3);
		lnk.push(4);
		lnk.push(5);
		lnk.pop();
		lnk.push(6);
		lnk.pop();
		lnk.pop();
		lnk.push(9);
		lnk.print();
		
		
		
		
		

	}

}
