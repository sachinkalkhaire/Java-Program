package Programs;

public class REmoveWhiteSpaceInString25 {

	public static void main(String[] args) {
		String s="  welcome  to the java   ";
        System.out.println(s.replaceAll(" ", ""));  //welcometothejava
        System.out.println(s.trim());      //welcome  to the java
	}

}
