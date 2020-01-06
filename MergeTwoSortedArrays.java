import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author sangeetha
 *
 */
public class MergeTwoSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] array1={1,9,13,89,90,101};
		Integer[] array2={2,11,12,45,78,91,102};
		merge(array1,array2);
		merge1(array1,array2);

	}
public  static void merge(Integer[] ip1,Integer[]ip2){
	
	List<Integer> output=new ArrayList<>();
	Collections.addAll(output, ip1);
	Collections.addAll(output, ip2);
	Collections.sort(output);
	System.out.println(output);
}
public static void merge1(Integer[] ip1,Integer[]ip2){
	Integer[] ResultantArray= new Integer[ip1.length+ip2.length];
	int i=0,j=0,k=0;
	while(i< ip1.length && j<ip2.length){
		if(ip1[i]<ip2[j]){
			ResultantArray[k++]=ip1[i++];
		}
		else{
			ResultantArray[k++]=ip2[j++];
		}
	}
	
	 while (i < ip1.length) 
		 ResultantArray[k++] = ip1[i++]; 
   
     // Store remaining elements of second array 
     while (j < ip2.length) 
    	 ResultantArray[k++] = ip2[j++];
	System.out.println(Arrays.asList(ResultantArray));
	}
		
		
	}
	



