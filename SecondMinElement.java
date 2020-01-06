import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author sangeetha
 *
 */
public class SecondMinElement {

	public static int findSecondMinElementM1(int input[]){
		Arrays.sort(input);
		return input[1];
		
		
	}
	public static int findSecondMinElementM2(int input[]){
		
		PriorityQueue<Integer> pq= new PriorityQueue<>(2,Collections.reverseOrder());
		for(int number: input){
			pq.offer(number);
			if(pq.size()>2){
				pq.poll();
			}
		}
		return pq.poll();
	}
	
	public static int findSecondMinElementM3(int input[]){
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		for(int number :input){
			if(number<first){
				second=first;
				first=number;
				
			}
			else if(number < second && number != first)
			{
			second = number;
			}
		}
		
		return second;
	}
	public static void main(String args[]){
		
		int input[]={-1,20,90,78,-100,-78,-99,67,98,45};
		System.out.println(findSecondMinElementM1(input));
		System.out.println(findSecondMinElementM2(input));
		System.out.println(findSecondMinElementM3(input));
		
	}
}
