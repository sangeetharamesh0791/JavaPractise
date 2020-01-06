/**
 * 
 */

/**
 * @author acer
 *
 */
public class DoubleLinkedList {

	
	class Node{
		int data;
		Node Prev;
		Node Next;
		
	}
	private Node head;
	private Node tail;
	int size;
	public boolean isEmpty(){
		boolean empty=false;
		if(head==null && tail==null){
			empty=true;
		}
		return empty;
	}
	public void insertAtStartLL(int value){
		Node newNode= new Node();
		newNode.data=value;
		newNode.Prev=null;
		
		if(isEmpty()){
			newNode.Next=null;
			head=tail=newNode;
			size++;
		}
		else{
			Node PrevHead=head;
			newNode.Next=PrevHead;
			PrevHead.Prev=newNode;
			//tail=newNode;
			size++;
		}
		
		
	}
	public void insertAtEndLL(int value){
		
		Node newNode= new Node();
		newNode.data=value;
		Node oldTail=tail;
		if(tail!=null){
			tail.Next=newNode;
			newNode.Prev=tail;
			tail=newNode;
			size++;
		} else{
			head=tail=newNode;
			size++;
		}
		   
		
	} 
	
	public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.Next;  
        }  
    }  
	public static void main(String[] args) {
		DoubleLinkedList dll= new DoubleLinkedList();
		dll.insertAtEndLL(1);
		dll.insertAtEndLL(2);
		dll.insertAtEndLL(3);
		dll.insertAtEndLL(4);
	//	dll.insertAtEndLL(19);
		dll.display();	
		

	}

}
