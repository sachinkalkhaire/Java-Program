package Programs;

public class PalindromeNumber4 {

	public static void main(String[] args) {


		//palindrome number:actual number is equal to revered number   141..>141

		int num=141;
		int rev=0;
		int original_num=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}

		if(rev==original_num)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
