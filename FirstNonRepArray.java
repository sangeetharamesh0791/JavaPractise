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
public class FirstNonRepArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Integer input [] = {10, 5, 3, 10,3, 5, 4,6};
		 List<Integer> list= new ArrayList<>();
			Collections.addAll(list, input);
			for(Integer number:list){
				if(list.indexOf(number)==list.lastIndexOf(number)){
					System.out.println(number);
					break;
				}
			}

	}

}
