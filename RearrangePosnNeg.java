import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author sangeetha
 *
 */
public class RearrangePosnNeg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer input[] = { 1, 89, -1, 45, 90, 67, -90, 34, -69 };
		List<Integer> Output = new ArrayList<>();
		Collections.addAll(Output, input);
		Collections.sort(Output);
System.out.println(Output);
	}

}
