import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author Sangeetha
 *
 */
public class FindDuplicateCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "Malayalam";
		char[] testcArray = test.toCharArray();
		Map<Character, Integer> duplicateCount = new LinkedHashMap<>();
		for (char c : testcArray) {
			if (duplicateCount.containsKey(c)) {

				duplicateCount.put(c, duplicateCount.get(c) + 1);
			} else {
				duplicateCount.put(c, 1);
			}
			

		}
		
		for(Map.Entry<Character, Integer> entry:duplicateCount.entrySet()){
			
			System.out.println(entry.getKey()+" is repeated "+entry.getValue()+"times");
		}

	}

}
