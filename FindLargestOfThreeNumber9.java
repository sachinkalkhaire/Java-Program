package Programs;

public class FindLargestOfThreeNumber9 {

	public static void main(String[] args) {
		// Find largest of 3 number
		int a=10;
		int b=200;
		int c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number:"+a);
		}
		
		else if(b>a && b>c)
		{
			System.out.println("b is largest number:"+b);
		}
		
		else if(c>a && c>b)
		{
			System.out.println("c is largest number:"+c);
		}
		

	}

}
