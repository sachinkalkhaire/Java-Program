package Programs;

public class CountEven_oddDigitInNumber7 {

	public static void main(String[] args) {
		// count number of even and odd digit in a number
		
		int num=77778;
		int oddcount=0;
		int evencount=0;
		
		while(num>0)
		{
			int ref=num%10;
			if(ref%2==0)
			{

				evencount++;
			}
			else 

			{
				oddcount++;
			}
			num=num/10;

		}

		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
