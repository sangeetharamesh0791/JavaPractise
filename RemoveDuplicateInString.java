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
public class RemoveDuplicateInString {
	
public static void main(String[] args) {
		
		method1();
}
	
public static void method1(){
	String input="Sangeetha";
	String output="";
	for(int i=0;i<input.length();i++){
		char alphabet= input.charAt(i);
		
		if(input.indexOf(alphabet, i)!=input.lastIndexOf(alphabet)){
			input=input.replaceAll(String.valueOf(alphabet), "~");
		}
	}
	System.out.println(input);
	String finalString="";
	String SplitArray[]=input.split("~");
	for(String split:SplitArray){
		finalString+=split;
		
	}
	System.out.println(finalString);
}
}
