import java.util.Arrays;

/**
 * 
 */

/**
 * @author sangeetha
 *
 */
public class ReverseStringRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testString="Madam im adam";
		char[] charArray=testString.toCharArray();
		int high=charArray.length-1;
		int low=0;
		char[] output=recursion(charArray,low,high );
		for(char c:output){
			System.out.print(c);
		}
		

	}
	public static char[] recursion(char[] input ,int low,int high){
		char temp=' ';
			
		if(low<high){
			temp=input[low];
			input[low]=input[high];
			input[high]=temp;
			
			recursion(input,low+1,high-1);
			
		}
		else{
			return input;
		}
		return input;
	}

}
