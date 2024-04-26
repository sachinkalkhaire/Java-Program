package Programs;

public class NumberIsPrimeOrNot11 {

	public static void main(String[] args) {
		// prime number: 1.number >1
	   //                2.number divide by its self only
       // ex.2,3,5,7,11
		
		int num=11;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("number is prime: "+num);
			}
			else
			{
				System.out.println("number is not prime");
			}
		}
		else
		{
			System.out.println("not prime number");
		}
		
	}

}
