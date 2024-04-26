package Programs;

import java.util.Scanner;

public class CountNumberofWordInString27 {

	public static void main(String[] args) {

		//find number of word in string
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter string");
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
				
			}
		}
		System.out.println(count);
	}

}
