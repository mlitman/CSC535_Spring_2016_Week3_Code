import java.util.Random;

public class Driver 
{
	//collection of methods
	public static void main(String[] args)
	{
		int[] ar = new int[20];
		Driver.fillArray(ar);
		printArray(ar, 0, ar.length-1);
		Driver.mergeSort(ar, 0, ar.length-1);
		printArray(ar, 0, ar.length-1);
	}
	
	static void mergeSort(int[] ar, int begin, int end)
	{
		if(begin != end)
		{
			int leftBegin = begin;
			int leftEnd = (begin + end)/2;
			int rightBegin = leftEnd + 1;
			int rightEnd = end;
			mergeSort(ar, leftBegin, leftEnd);
			mergeSort(ar, rightBegin, rightEnd);
			
			//we have partially sorted lists
			//leftBegin to leftEnd is sorted
			//rightBegin to rightEnd is sorted
			//merge step
			int leftPos = leftBegin;
			int rightPos = rightBegin;
			int[] temp = new int[end-begin+1];
			//fills temp up with the elements in ar from begin to end in the correct order
			for(int i = 0; i < temp.length; i++)
			{
				if(leftPos > leftEnd)
				{
					temp[i] = ar[rightPos];
					rightPos++;
				}
				else if(rightPos > rightEnd)
				{
					temp[i] = ar[leftPos];
					leftPos++;
				}
				else
				{
					if(ar[leftPos] < ar[rightPos])
					{
						temp[i] = ar[leftPos];
						leftPos++;
					}
					else
					{
						temp[i] = ar[rightPos];
						rightPos++;
					}
				}
			}
			
			//copy the contents of temp into buckets begin to end of ar
			int pos = 0;
			for(int i = begin; i <= end; i++)
			{
				ar[i] = temp[pos];
				pos++;
			}
		}
	}
	
	static void printArray(int[] ar, int begin, int end)
	{
		System.out.println("******");
		for(int i = begin; i <= end; i++)
		{
			System.out.print(ar[i] + "\t");
		}
		System.out.println("");
	}
	
	static void fillArray(int[] ar)
	{
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(100);
		}
	}
	
}