package Programs;

public class FindDuplicateElementInArray19 {

	public static void main(String[] args) {
		// Find Duplicate Element In Array
		
		int a[]= {10,20,30,20,30,40,50};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+":duplicate element found in array");
					flag=true;
				}
				}
			}
		if(flag==false)
		{
			System.out.println("duplicate element not found in array");
		}
		
		}

	}


