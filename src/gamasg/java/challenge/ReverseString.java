package gamasg.java.challenge;

public class ReverseString {

	public static void main(String[] args) {
		String Str = "Hello World!";
		System.out.println("Solution 01: " + ReverseWithStringBuilder(Str));
		System.out.println("Solution 02: " + ReverseManuallyWithStringBuilder(Str));
		System.out.println("Solution 03: " + ReverseManuallyWithoutStringBuilder(Str));
	}
	
	//Successfully reverse a string using StringBuilder()
	private static String ReverseWithStringBuilder(String Str) {
		StringBuilder stringBuilder = new StringBuilder();
		String reversedStr = stringBuilder.append(Str).reverse().toString();
		return reversedStr;
	}
	
	//Successfully reverse a string manually using StringBuilder()
	private static String ReverseManuallyWithStringBuilder(String Str) {
		StringBuilder stringBuilderManual = new StringBuilder();
		for(int i = (Str.length() - 1); i >= 0; i--) {
			stringBuilderManual.append(Str.charAt(i));
		}
		return stringBuilderManual.toString();
	}
	
	//Successfully reverse a string manually without using StringBuilder()
	private static String ReverseManuallyWithoutStringBuilder(String Str) {
		/*This is the most expensive implementation because each time myBuffer is
		 written to, a new copy of the buffer is created. StringBuilder avoids this.*/
		String myBuffer = "";
		for(int i = (Str.length() - 1); i >= 0; i--) {
			myBuffer = myBuffer + Str.charAt(i);
		}
		return  myBuffer;
	}
}