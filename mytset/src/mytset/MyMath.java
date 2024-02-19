package mytset;

public class MyMath 
{
	double approxSqrt(double x, double amount, int a)
	{
		double prev = 0;
		double iteration = 0;
		prev = x;
		
		for(int i = 0; amount > i; i++)
		{
			iteration = (prev + (a/ prev))/ 2;
			prev = iteration;
		}
		return prev;
	}
	
	double sqrt(int a, int approx)
	{
		int i = 0;
		for(;;)
		{
			if(i*i == a)
			{
				return i;
			}
			
			if(i*i > a)
			{
				double num3 = (i + (i-1)) / 2;
				return approxSqrt(num3, approx, a);
			}
			i++;
		}
	}
}
