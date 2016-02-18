
public class Driver 
{
	//collection of methods
	public static void main(String[] args)
	{
		System.out.println(baseToDecimal("264",8));
		System.out.println(baseToDecimal("101101",2));
		System.out.println(baseToDecimal("237",10));
		System.out.println(baseToDecimal("bad",16));
		System.out.println(decimalToBase(45,2));
		System.out.println(decimalToBase(180,8));
		System.out.println(decimalToBase(237,10));
		System.out.println(decimalToBase(2989,16));
	}
	
	static char intToChar(int num)
	{
		return "0123456789ABCDEF".charAt(num);
	}
	
	static String decimalToBase(int val, int radix)
	{
		String answer = "";
		while(val/radix != 0)
		{
			answer = "" + intToChar(val%radix) + answer;
			val /= radix;
		}
		return "" + intToChar(val%radix) + answer;
	}
	
	static String decimalToDecimal(int val)
	{
		String answer = "";
		while(val/10 != 0)
		{
			answer = "" + (val%10) + answer;
			val /= 10;
		}
		return "" + (val%10) + answer;
	}
	
	static String decimalToOctal(int val)
	{
		String answer = "";
		while(val/8 != 0)
		{
			answer = "" + (val%8) + answer;
			val /= 8;
		}
		return "" + (val%8) + answer;
	}
	
	static String decimalToBinary(int val)
	{
		String answer = "";
		while(val/2 != 0)
		{
			answer = "" + (val%2) + answer;
			val /= 2;
		}
		return "" + (val%2) + answer;
	}
	
	static int charToInt(char c)
	{
		return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c);
	}
	
	static int baseToDecimal(String val, int radix)
	{
		val = val.toUpperCase();
		int place = 1;
		int sum = 0;
		for(int i = val.length()-1; i >= 0; i--)
		{
			sum = sum + (charToInt(val.charAt(i)) * place);
			place *= radix;
		}
		return sum;
	}
}