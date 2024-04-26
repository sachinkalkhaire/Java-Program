package Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortElementInArray23 {

	public static void main(String[] args) {
		//int a[]= {10,54,89,23,45,37,90};
		//System.out.println("before sort:"+Arrays.toString(a));
		//Arrays.sort(a);
		//System.out.println("after sort:"+Arrays.toString(a));
		
		//sort in decending order
		Integer a[]= {10,54,89,23,45,37,90};
		System.out.println("before sort:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("after sort:"+Arrays.toString(a));
	}

}
