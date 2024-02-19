package mytset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest 
{	
	/**
	 * 
	 * Returns the largest integer of three given integers.
	 * 
	 * @pre All given numbers must be integers.
	 * @post Returns the greatest integer.
	 */
	
	
	int max3(int x, int y, int z)
	{
		if((x > y) && (x > z))
		{
			return x;
		}
		else if(y > z)
		{
			return y;
		}
		else
		{
			return z;
		}
	}
	
	/**
	 * Geef de mediaan van de drie verschillende gegeven getallen terug.
	 * 
	 * @pre De argumenten zijn verschillend.
	 * 		| x != y && y != z && x != z
	 * @post Het resultaat is gelijk aan x, y of z.
	 * 		| result == x || result == y || result == z
	 * @post Het resultaat is groter dan x of y of z.
	 * 		| x < result || y < result || z < result
	 * @post Het resultaat is kleiner dan x of y of z.
	 * 		| x > result || y > result || z > result
	 */
	
	int mediaan(int x, int y, int z)
	{
		int result = 0;
		return result;
	}
	
	
	
	/**
	 * Returns the index for the first found instance of a given number in an array.
	 * 
	 * @pre | haystack != null
	 */
	int find(int[] haystack, int needle)
	{
		int i = 0;
		while(i < haystack.length)
		{
			if(haystack[i] == needle)
			{
				return i;
			}
			else
			{
				i++;
			}
		}
		return -1;
	}
	
	void negatie(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = -array[i];
		}
	}
	
	
	/**
	 * Sorteert.
	 * @pre | array != null
	 * @mutates | array
	 * @post De elementen zijn oplopend.
	 * 		| IntStream.range(1, array.length).allMatch(i -> array[i - 1] <= array[i])
	 * @post De inhoud van de array, gezien als een multiset ( verzameling met mogelijks meerdere voorkomens van een element), is ongewijzigd gebleven.
	 * 		| IntStream.range(0, array.length).allMatch(i ->
	 * 		| 	IntStream.range(0, array.length).filter(j -> array[j] == array[i].count() ==
	 * 		| 	IntStream.range(0, array.length).filter(j -> old(array.clone())[j]) == array[i]).count())
	 * 		
	 */
	
	void sort(int[] array)
	{
		int temp = 0;
		int n = array.length;
		for(int i = 0; i < n; i++)
		{
			int min_index = i;
			for(int j = (i + 1); j < n; j++)
			{
				if(array[j] < array[min_index])
				{
					min_index = j;
				}
			}
			temp = array[i];
			array[i] = array[min_index];
			array[min_index] = temp;
		}
	}
	
	
	/**
	 * Verwisselt de elementen op de gegeven indices in de gegeven array met elkaar.
	 * 
	 * @pre | array != null
	 * @pre De geldig indices zijn geldig.
	 * 		| 0 <= x && x < array.length && 0 <= y && y < array.length
	 * @mutates array
	 * @post | array[x] == old(array.clone())[y]
	 * @post | array[y] == old(array.clone())[x]  
	 * @post | InStream.range(0, array.length).allMatch(i -> i == x || i == y || array[i] == old(array.clone()[i]))
	 */
	
	void verwisselt(int[] array, int x, int y)
	{
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	
	
	void print_array(int[] array)
	{
		int i = 0;
		System.out.print("[");
		while(i < array.length)
		{
			System.out.print(array[i]);
			if(i != array.length - 1)
			{
				System.out.print(", ");
			}
			else
			{
				System.out.print("]");
				System.out.println("");
			}
			i++;
		}
	}
	
	@Test
	void test() 
	{
		double polska = sqrt(16310, 1);
		double pol1 = sqrt(16310, 2);
		double pol2 = sqrt(16310, 3);
		
		int[] test = {1, 2, 3, 4};
		int[] test_sort = {2, 1, 4, 3};
		
		System.out.println(polska);
		System.out.println(pol1);
		System.out.println(pol2);
		
		System.out.println(find(test, 2));
		print_array(test_sort);
		sort(test_sort);
		print_array(test_sort);

	}

}
