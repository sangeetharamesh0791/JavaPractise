import java.util.regex.Pattern;

/**
 * @author sangeetha
 *
 */
public class StrngContainsNumbers {

	public static void main(String args[]){
		String input="S4N633th4";
		String input1="Sangeetha+";
		String input2="740187";
		if(Pattern.matches(".*\\d+.*",input1)){
			
			System.out.println("String contains atleast 1  digits");
		}else if(Pattern.matches("[\\d]*", input2)){
			System.out.println("String contains only  digits");
		}
		
	}
}
