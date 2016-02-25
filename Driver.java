import java.util.Random;
import java.util.Scanner;

public class Driver 
{
	//collection of methods
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a numerator: ");
		//long num = Long.parseLong(input.nextLine());
		long num = input.nextLong();
		System.out.print("Please enter a denominator: ");
		long denom = input.nextLong();
		Fraction f1 = new Fraction(num, denom);
		
		System.out.print("Please enter a numerator: ");
		//long num = Long.parseLong(input.nextLine());
		num = input.nextLong();
		System.out.print("Please enter a denominator: ");
		denom = input.nextLong();
		Fraction f2 = new Fraction(num, denom);
		
		Fraction f3 = f1.add(f2);
		f3.reduce();
		f3.display();
	}
}