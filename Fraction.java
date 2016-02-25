
public class Fraction 
{
	//Fields - are the attributes we need to remember about a Fraction
	private long numerator;
	private long denominator;
	
	//constructor - are always named the same as the class and setup
	//the initial state of an object
	Fraction(long numerator, long denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	private static long gcd(long a, long b)
	{
		long t;
		while(b != 0)
		{
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
	public Fraction add(Fraction f)
	{
		long commonDenom = this.denominator * f.denominator;
		long newNum1 = this.numerator * f.denominator;
		long newNum2 = f.numerator * this.denominator;
		Fraction answer = new Fraction(newNum1 + newNum2, commonDenom);
		return answer;
	}
	
	public void reduce()
	{
		long divisor = Fraction.gcd(this.numerator, this.denominator);
		this.numerator /= divisor;
		this.denominator /= divisor;
	}
	
	public void display()
	{
		System.out.println(this.numerator + "/" + this.denominator);
	}
	
	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}
	
	
}
