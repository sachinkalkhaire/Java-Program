package Programs;

public class PalindromeString5 {

	public static void main(String[] args) {
		//Palindrome string: compare reverse string equals original string

		String s="madam";
		String rev="";
		String original_String=s;
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string:"+rev);
		if(original_String.equals(rev))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
		
		
	}

}
