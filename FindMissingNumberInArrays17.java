package Programs;

public class FindMissingNumberInArrays17 {

	public static void main(String[] args) {
		//num1=1,2,3,5
		//num2=1,2,3,4,5   missing number=sum2-sum1=
		int a[]= {1,2,3,5};	

		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum2-sum1+" :missing number");
	}

}
