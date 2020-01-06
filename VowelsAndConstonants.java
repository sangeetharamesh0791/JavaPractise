import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author Sangeetha
 *
 */
public class VowelsAndConstonants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "Ani@sh Roy ";
		int vowel = 0, consonant = 0;
		char[] inputArray = input.toUpperCase().toCharArray();
		for (char c : inputArray) {
			if (c >= 65 && c <= 90) {
				if (c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U') {
					vowel++;

				}else{
					consonant++;
				}
			}

		}

		System.out.println("Vowels Count" + vowel);
		System.out.println("Consonant" + consonant);

	}
}
