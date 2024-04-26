package Programs;

public class ReversNum2 {

	public static void main(String[] args) {
		
		//logic 1
		int num=1234;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;  //0+1234%10=4    4*10+3=43    43*10+2=432   432*10+1=4321
			num=num/10;  //1234/10=123    123/10=12    12/10=1  1/10=0
		}
		
		System.out.println(rev);
		
		
		
		
		//String buffer//2
		int number=12345;
		StringBuffer sb=new StringBuffer(String.valueOf(number));
		System.out.println(sb.reverse());
	}

}
