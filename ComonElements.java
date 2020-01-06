import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 */

/**
 * @author acer
 *
 */
public class ComonElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 24, 45, 67,73, 90 };
		int arr2[] = {24, 43, 73,89, 98, 670};
		int arr3[] = { 24, 43, 98, 101, 120 };
		List<Integer> common = new ArrayList<>();
		
		for (int number : arr1) {
			int low = 0;
			int high = arr2.length-1;
			while (low < high) {
				int mid = (low + high) / 2;
				if (number >arr2[mid]) {
					low = mid + 1;
				}else if(number==arr2[mid]){
					common.add(number);
					break;
				}
				else {
					high = mid - 1;

				}

			}

		}
System.out.println(common);
ListIterator<Integer> listIterator = common.listIterator();

	while(listIterator.hasNext()){
		boolean numberPresent=false;
		Integer item= listIterator.next();
		for(int numbIn3: arr3){
		
		if(numbIn3==item){
			numberPresent=true;
			
			break;
			
		}
		
	}
		if(!numberPresent){
			listIterator.remove();
		}
	
}
	System.out.println(common);



	}

}
