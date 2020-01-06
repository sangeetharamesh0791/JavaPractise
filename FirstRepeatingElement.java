import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author acer
 *
 */
public class FirstRepeatingElement {
	public static void main(String[] args) {
		
		Integer inputArray[]={10, 5, 3, 4, 3, 5, 6};
		List<Integer> list= new ArrayList<>();
		Collections.addAll(list, inputArray);
		for(Integer number:list){
			if(list.indexOf(number)!=list.lastIndexOf(number)){
				System.out.println(number);
				break;
			}
		}
}
}