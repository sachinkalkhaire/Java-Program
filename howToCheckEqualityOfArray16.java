package Programs;

import java.util.Arrays;

public class howToCheckEqualityOfArray16 {

	public static void main(String[] args) {
		// how to check equality of an arrays
		//int a1[]={10,20,30,40};
		//int a2[]={10,20,30,40};
        //a1==a2;    compare to array value is match or not
		
		
		int a1[]={10,20,30,40};
		int a2[]={10,20,30,40};
		
	boolean array=Arrays.equals(a1, a2);
	if(array==true)
	{
		System.out.println("both arrays are equals");
		
	}
	else
	{
		System.out.println("both arrays are not equals");
	}
	}

}
