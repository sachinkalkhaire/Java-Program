package Programs;

public class RemoveSpecialCharacterInString24 {

	public static void main(String[] args) {
		//String s="Sachin@gmail$&%122#^";  ...>after remove special character....>Sachingmail122

		String s="Sachin@gmail$&%122#^";                        //Sachin@gmail$&%122#^
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));   //Sachingmail122

	}

}
