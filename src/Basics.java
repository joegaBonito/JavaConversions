import java.util.Arrays;

public class Basics {
	public static void main(String args[]) {
		/*
		 * Array to String conversion
		 */
		arrayToString();
		
		/*
		 * String to int[] conversion
		 */
		stringToIntArray();
		
		/*
		 * String to char[] conversion
		 */
		stringToCharArray();
		
		/*
		 *  Integer to String conversion.
		 */
		IntegerToString();
		
		/*
		 *  String to Integer conversion.
		 */
		stringToInteger();
	}



	private static void arrayToString() {
		System.out.println("int[] to String conversion");
		int[] intArr = {1,2,3,4,5,6,7,8};
		System.out.print(" Initial Array: ");
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println("");
		String strnum = Arrays.toString(intArr).replace("[","").replace("]","").replace(", ","");
		System.out.println(" String: "+strnum+"\n");
		
		System.out.println("char[] to String conversion");
		char[] charArr = {'h','e','l','l','o'};
		System.out.print(" Initial Array: ");
		for(int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
		System.out.println("");
		String strchar = Arrays.toString(charArr).replace("[","").replace("]","").replace(", ","");
		System.out.println(" String: "+strchar+"\n");
	}
	
	private static void stringToIntArray() {
		System.out.println("String to int[] conversion");
		String strnum = "12345";
		System.out.println(" Initial String Value: " + strnum);
		char[] charArr = new char[strnum.length()];
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = strnum.charAt(i);
		}
		int[] intArr = new int[charArr.length];
		for(int j = 0; j < intArr.length; j++) {
			intArr[j] = charArr[j] - '0';
		}
		System.out.print(" int[] value: ");
		for(int k = 0; k < intArr.length; k++)
			System.out.print(intArr[k] + " ");
		System.out.println("");
		System.out.println("");
	}
	
	private static void stringToCharArray() {
		System.out.println("String to char[] conversion");
		String strnum = "hello";
		System.out.println(" Initial String Value: " + strnum);
		char[] charArr = new char[strnum.length()];
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = strnum.charAt(i);
		}
		System.out.print(" char[] value: ");
		for(int k = 0; k < charArr.length; k++)
			System.out.print(charArr[k] + " ");
		System.out.println("");
		System.out.println("");
	}
	
	private static void IntegerToString() {
		System.out.println("Integer to String conversion");
		int num = 12345;
		System.out.println(" Initial int value: " + num);
		String str = Integer.toString(num);
		System.out.println(" int to String :" + str);
		
		long lo = 12345;
		System.out.println(" Initial long value: " + lo);
		String strLo = Long.toString(lo);
		System.out.println(" long to String :" + strLo);
		
		double doub = 12345;
		System.out.println(" Initial double value: " + doub);
		String str2 = Double.toString(doub);
		System.out.println(" double to String :" + str2);
		
		float floa = 12345;
		System.out.println(" Initial float value: " + floa);
		String str3 = Float.toString(floa);
		System.out.println(" float to String :" + str3 + "\n");
	}

	private static void stringToInteger() {
		System.out.println("String to Integer conversion");
		String strNum = "12345";
		System.out.println(" Initial String value: " + strNum);
		
		int numInt = Integer.parseInt(strNum);
		System.out.println(" String to int :" + numInt);
		
		long numLong = Long.parseLong(strNum);
		System.out.println(" String to long :" + numLong);
		
		double doub = Double.parseDouble(strNum);
		System.out.println(" String to double :" + doub);
		
		float floa = Float.parseFloat(strNum);
		System.out.println(" String to float :" + floa + "\n");
	}


}
