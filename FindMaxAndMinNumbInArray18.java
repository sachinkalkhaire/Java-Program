package Programs;

public class FindMaxAndMinNumbInArray18 {

	public static void main(String[] args) {
		// find minimum and maximum number in array

		int a[]= {20,50,29,45,27};

		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);


		int max=0;
		for(int i=0;i<a.length;i++)		
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}


