package Programs;

public class SearchElementInArray20 {

	public static void main(String[] args) {
		// Search element in array (Linear search)
		int a[]= {30,50,90,54,24};
		int searchEle=54;
		boolean flag=false;
		for(int i:a)
		{
			if(searchEle==i)
			{
				System.out.println(searchEle +"element found in array");

				flag=true;
				break;
			}
		}

		if(flag==false)
		{
			System.out.println("element not found in array");
		}

	}

}
