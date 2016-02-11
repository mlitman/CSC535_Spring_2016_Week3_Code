
public class Driver 
{
	//collection of methods
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		System.out.println(reverse(s2));
	}
	
	static String reverse(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >= 0; i--)
		{
			answer = answer + s.charAt(i);
		}
		return answer;
	}
	
	static void printString(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	//if(boolean_expression) { collection of zero or more statements }
	static int max(int num1, int num2)
	{
		if(num1 > num2) 
		{
			return num1;
		}
		return num2;
	}
	
	static int addNums(int a, int b)
	{
		return a - b;
	}
	
	//method definition - this is an untapped resource!
	static int factorial(int num)
	{
		int answer = 1;
		for(int i = num; i >= 1; i--)
		{
			answer = answer * i;
		}
		return answer;
	}
}
