/**
 * 
 */

/**
 * @author acer
 *
 */
public class QueueUsingLinkedList {

	class Node{
	int value;	
	Node next;	
	}
	public Node front,rear;
	int capacity;
	int currentSize=0;
	public  void enqueue(int value){
		Node newNode= new Node();
		newNode.value=value;
		System.out.println("value to be inserted:"+value);

		if(currentSize==0){
			
			front=rear=newNode;
			newNode.next=null;
			currentSize++;
			
		}else{
			
			
				Node oldRear=rear;
				System.out.println("old Rear"+oldRear.value);
				newNode.next=oldRear;
			rear=newNode;
			

			currentSize++;
			
		}
		System.out.println("front.value:"+front.value);
		System.out.println("rear:"+rear.value);		
		
	}
	
	public void dequeue(){
		if(currentSize==0){
			System.out.println("Queue is empty can't dequeue");
		}else{
			
			System.out.println("Item removed:"+front.value);
			front = front.next;
			currentSize--;
		}
		
		
		
	}
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.capacity=5;
		 queue.enqueue(6);
		 queue.dequeue();
		 queue.enqueue(3);
		 queue.enqueue(99);
		 queue.enqueue(56);
		 queue.dequeue();
		 queue.enqueue(43);
		 queue.dequeue();
		 queue.enqueue(89);
		 queue.enqueue(77);
		 queue.dequeue();
		 queue.enqueue(32);
		 queue.enqueue(232);

	}

}
