/**
 * 
 */

/**
 * @author acer
 *
 */
public class SearchInRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
		int number = -8;
		int pos = -1;

		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == number) {
				pos = mid;
				System.out.println(arr[mid]);
				break;
			} else if (arr[mid] <= arr[high]) {
				if (arr[mid] < number && number < arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			} else {

				if (arr[low] <= number && arr[mid] > number) {

					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

		}
if(pos==-1){
	
	System.out.println("Element not found" );
	
}else{
	
	System.out.println("Element found at position:"+pos );
	
}
	}

}
