package Programs;

public class ReverseString3 {

	public static void main(String[] args) {
		
		String s="welcome";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);

		
		
		//StringBuffer
		String a="java";
		StringBuffer sb =new StringBuffer(a);
		System.out.println(sb.reverse());
	}

}
