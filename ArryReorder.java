import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author acer
 *
 */
public class ArryReorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a[]={"a","c","e","g","b","d","f","h"};
		int mid=(0+a.length)/2;
		int i=1;
		while(mid>i && i<a.length-1){
			int j=mid;
		while(j>i)
		{
			String temp=a[j];
		a[j]=a[j-1];
		a[j-1]=temp;
		j--;
		}
		mid++;
		i=i+2;
			
		}
		
	for(String alpha:a){
		System.out.print(alpha+"\t");
	}

}
}