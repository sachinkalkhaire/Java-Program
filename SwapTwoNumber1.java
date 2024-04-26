package Programs;

public class SwapTwoNumber1 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		/*
		 //logic 1
		//by using third variable
		int t=a;  //10
		a=b;   //20
		b=t;   //10
		System.out.println(a+" "+b); */

		//logic 2
		/*	//use +,- without third variable
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println(a+" "+b);*/

		//logic 3
		//use *,/ without third variable
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		System.out.println(a+" "+b);
	}

}
