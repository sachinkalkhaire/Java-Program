package Programs;

public class FindSumOfElementInArray14 {

	public static void main(String[] args) {
		// find sum of element in array

		//Example 1:
		int a[]= {10,20,30,40,50};
		int sum =0;
		for(int i:a)
		{
			sum=sum+i;
		}
		System.out.println(sum);  //10+20+30+40+50=150


		//Example 2:
		int Array[]= {10,20,30,40,50};
		int sum1 =0;
		for(int i=0;i<Array.length;i++)
		{
			sum1=sum1+Array[i];
		}
		System.out.println(sum1);  //10+20+30+40+50=150

	}

}
