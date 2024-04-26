package Programs;

import java.util.Random;

public class GenerateRandomNumberOrString12 {

	public static void main(String[] args) {

		//Approach 1
		Random rm=new Random();
		int randomInt=rm.nextInt(10);
		System.out.println(randomInt); //print randomly one by one 0...>10 number

		Double randomDouble=rm.nextDouble(23);
		System.out.println(randomDouble); //print randomly one by one 0.0...9.5185...>23.0 number

		//Approach 2
		/*
		String randomNumber=RandomStringUtils.randomNumeric(10);
		System.out.println(randomString); 

		String randomString=RandomStringUtils.randomAlphabetic(10);
		System.out.println(randomString); 
		*/
	}

}
