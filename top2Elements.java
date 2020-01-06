import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author acer
 *
 */
public class top2Elements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int inputArray[] = { 100, 1, 45, 99, 34, 75, 2, 4, 5, 98 };
		PriorityQueue q = new PriorityQueue<>(inputArray.length,Collections.reverseOrder());
		for (int number : inputArray) {
			q.offer(number);
		}
System.out.println(q.poll()+"\t"+q.peek());
	}
}