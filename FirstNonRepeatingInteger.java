import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author sangeetha
 *
 */
public class FirstNonRepeatingInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Integer input[]={10,89,90,67,10,90,10,7,6,67,34,89};
List<Integer> aList=new ArrayList<>();
Collections.addAll(aList, input);
Integer nonrepeated=Integer.MAX_VALUE;
for( Integer number: aList){
	if(aList.lastIndexOf(number)==aList.indexOf(number)){
		nonrepeated=number;
		break;
	}
	
} 

System.out.println(nonrepeated);
	}

}
