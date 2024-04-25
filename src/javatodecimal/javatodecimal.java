package javatodecimal;

public class javatodecimal {

	public static void main(String args[])
	{
		 String decimalString = "123";
	        String binaryString = decimalToBinary(decimalString);
	        System.out.println("Binary representation of " + decimalString + " is: " + binaryString);
	    }

	    public static String decimalToBinary(String decimalString) {
	        int decimal = Integer.parseInt(decimalString);
	        return Integer.toBinaryString(decimal);
	    }
	}

