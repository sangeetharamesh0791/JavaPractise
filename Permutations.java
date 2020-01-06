/**
 * 
 */

/**
 * @author sangeetha
 *
 */
public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="ABCD";
		char[] charArray=input.toCharArray();
		permutation(input,0,input.length()-1);
		

	}
	
	public static void permutation(String input,int left,int right){
		
		if(left==right){
			System.out.println(input);
			
		}else{
			for(int i=left;i<=right;i++){
				
				
				input= swap(input,left,i);
				permutation(input, left+1, right);
				input= swap(input,left,i);
				
			}
		}
	}

	private static String swap(String input, int left, int i) {
		char temp; 
		char[] charArray = input.toCharArray(); 
		temp = charArray[left] ; 
		charArray[left] = charArray[i]; 
		charArray[i] = temp; 
		return String.valueOf(charArray); 
	}
	
	

}
