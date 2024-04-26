package Programs;

public class CountNumberOfDigitsInNumber6 {

	public static void main(String[] args) {
		// count number of digits in a number

		int num=123456;
		int count=0;

		while(num>0)
		{
			num=num/10;
			count++;	
		}
		System.out.println(count);
	}

}
