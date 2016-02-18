
public class Driver 
{
	//collection of methods
	public static void main(String[] args)
	{
		String exp = "124 + 18 - 2       * 13 / 17";
		processExpression(exp);
	}
	
	static int stringToInt(String s)
	{
		int place = 1;
		int sum = 0;
		for(int i = s.length()-1; i >= 0; i--)
		{
			sum = sum + (charToInt(s.charAt(i)) * place);
			place = place * 10;
		}
		return sum;
	}
	
	static int charToInt(char c)
	{
		return "0123456789".indexOf(c);
	}
	
	static int doMath(String num1, String num2, char op)
	{
		int a = stringToInt(num1);
		int b = stringToInt(num2);
		
		if(op == '+')
		{
			return a + b;
		}
		else if(op == '-')
		{
			return a - b;
		}
		else if(op == '*')
		{
			return a * b;
		}
		else
		{
			return a / b;
		}
	}
	
	static void processExpression(String exp)
	{
		System.out.println(parseExpression(exp));
	}
	
	static int parseExpression(String exp)
	{
		String currNumber = "";
		String leftOperand = "";
		char op = '?';
		for(int i = 0; i < exp.length(); i++)
		{
			if(isDigit(exp.charAt(i)))
			{
				currNumber = currNumber + exp.charAt(i);
			}
			else if(exp.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				if(op == '?')
				{
					op = exp.charAt(i);
					leftOperand = currNumber;
					currNumber = "";
				}
				else
				{
					//do the math, store the result in leftOperand, overwrite op with the new and zero out currNumber
					leftOperand = "" + doMath(leftOperand, currNumber, op);
					currNumber = "";
					op = exp.charAt(i);
				}
			}
		}
		
		if(currNumber.length() > 0)
		{
			if(op == '?')
			{
				return stringToInt(currNumber);
			}
			else
			{
				return doMath(leftOperand, currNumber, op);
			}
		}
		else
		{
			return stringToInt(leftOperand);
		}
	}
	
	static boolean isDigit(char c)
	{
		return "0123456789".indexOf(c) != -1;
	}
	
	static void printVowels(String s)
	{
		String map = "aeiouAEIOU";
		for(int i = 0; i < s.length(); i++)
		{
			if(map.indexOf(s.charAt(i)) != -1)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
	
	static void printConsonants(String s)
	{
		String map = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		for(int i = 0; i < s.length(); i++)
		{
			if(map.indexOf(s.charAt(i)) != -1)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
	
	static void printDigits(String s)
	{
		String map = "0123456789";
		for(int i = 0; i < s.length(); i++)
		{
			if(map.indexOf(s.charAt(i)) != -1)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}
