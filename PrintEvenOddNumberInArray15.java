package Programs;

public class PrintEvenOddNumberInArray15 {

	public static void main(String[] args) {
		//find odd and even number in array

		int a[]= {1,2,3,4,5,6,7,8,9};
		for(int i:a)
		{
			if(i%2==0)
			{
				System.out.println("even number:" +i);
			}
			else
			{
				System.out.println("odd number:" +i);	
			}
		}
	}

}
