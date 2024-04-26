package Programs;

public class FactorialNumber13 {

	public static void main(String[] args) {
		
				// Factorial:
				//5=1*2*3*4*5
				
				int num=5;
				int factorial=1;
				for(int i=1;i<=num;i++)
				{
					factorial=factorial*i;
				}
				System.out.println(factorial);  // 1*2*3*4*5=120
				
			}

		}