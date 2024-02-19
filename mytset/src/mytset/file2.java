package mytset;
 
import static org.junit.jupiter.api.Assertions.*;
 
import java.util.stream.IntStream;
 
import org.junit.jupiter.api.Test;
 
class MyMathTest {
	
	/**
	 * Returns the square root (rounded down) of the given nonnegative number.
	 * 
	 * @pre The given number must be nonnegative.
	 *    | 0 <= x
	 * @post The result is the greatest nonnegative integer whose square is not greater than the given number.
	 *    | 0 <= result &&
	 *    | result * result <= x &&
	 *    | x < (result + 1) * (result + 1)
	 */
	int sqrt(int x) {
		int result = 0;
		while ((result + 1) * (result + 1) <= x)
			result++;
		return result;
	}
	
	/**
	 * Geeft het grootste van de drie gegeven getallen terug.
	 * 
	 * @post Het resultaat is groeter dan of gelijk aan de gegeven getallen.
	 *     | result >= x && result >= y && result >= z
	 * @post Het resultaat is gelijk aan één van de gegeven getallen.
	 *     | result == x || result == y || result == z
	 */
	int max3(int x, int y, int z) {
		return x > y ? x > z ? x : z : y > z ? y : z;
	}
	
	/**
	 * Geeft de mediaan van de drie verschillende gegeven getallen terug.
	 * TODO: Schrijf volledige formele documentatie.
	 */
	int mediaan(int x, int y, int z) {
		return 0; // TODO: Implementeer.
	}
	
	/**
	 * Geeft het aantal voorkomens van 'waarde' in 'getallen' terug.
	 * @pre Het argument `getallen` wijst naar een array; het is geen null-verwijzing.
	 *    | getallen != null
	 * @post Het resultaat is gelijk aan het aantal indices in `getallen` waarop `waarde` voorkomt.
	 *    | result == IntStream.range(0, getallen.length).filter(i -> getallen[i] == waarde).count()
	 */
	int tel(int[] getallen, int waarde) {
		int result = 0;
		for (int i = 0; i < getallen.length; i++)
			if (getallen[i] == waarde)
				result++;
		return result;
	}
	
	/**
	 * Verhoogt het element op index `index` in array `array` met `bedrag`.
	 * 
	 * @pre Het argument `array` wijst naar een array.
	 *     | array != null
	 * @pre De gegeven index is een geldige index voor `array`.
	 *     | 0 <= index && index < array.length
	 * @post De waarde in `array` op de gegeven index is gelijk aan de oude waarde plus het gegeven bedrag.
	 *     | array[index] == old(array[index]) + bedrag
	 */
	void verhoogElement(int[] array, int index, int bedrag) {
		array[index] += bedrag;
	}
	
	/**
	 * Verwisselt de elementen op de gegeven indices in de gegeven array met elkaar.
	 * TODO: Schrijf volledige informele en formele documentatie.
	 */
	void verwissel(int[] getallen, int index1, int index2) {
		// TODO: Implementeer
	}
	
	/**
	 * Vervangt elk getal in de gegeven array door zijn negatie.
	 * @pre Het argument `getallen` wijst naar een array.
	 *     | getallen != null
	 * @post Voor elke positie in `getallen` geldt dat de nieuwe waarde op die positie gelijk is aan de negatie van de oude waarde op die positie.
	 *     | IntStream.range(0, getallen.length).allMatch(i -> getallen[i] == -old(getallen.clone())[i]) 
	 */
	// voeg bovenaan (tussen de package-regel en de class-regel) 'import java.util.stream.IntStream;' toe als Eclipse dit niet zelf doet.
	void negatie(int[] getallen) {
		for (int i = 0; i < getallen.length; i++)
			getallen[i] = -getallen[i];
	}
	
	/**
	 * Geeft de index terug van het eerste voorkomen van `needle` in `haystack`, of -1 als `needle` niet voorkomt in `haystack`.
	 * 
	 * @pre | haystack != null
	 * @post Als de needle zich op index 0 bevindt, dan is het resultaat gelijk aan 0 (Deze postconditie is een speciaal geval van de laatste, ter illustratie.)
	 *      | !(haystack.length > 0 && haystack[0] == needle) || result == 0
	 * @post Als het resultaat -1 is, dan ...
	 *      | result != -1 || IntStream.range(0, haystack.length).allMatch(i -> haystack[i] != needle)
	 * @post Als het resultaat niet -1 is, dan ...
	 *      | result == -1 || true // VERVANG 'true' DOOR DE VOORWAARDE
	 */
	int find(int[] haystack, int needle) {
		return 0; // TODO: Implementeer
	}
	
	/**
	 * Sorteert de getallen in de gegeven array van klein naar groot.
	 * @post VUL AAN
	 *      | true // VUL AAN
	 */
	void sort(int[] values) {
		// TODO: Implementeer
	}
 
	@Test
	void testSqrt() {
		assertEquals(3, sqrt(9));
		assertEquals(0, sqrt(0));
		assertEquals(3, sqrt(15));
		assertEquals(4, sqrt(16));
	}
	
	@Test
	void testMax3() {
		assertEquals(30, max3(10, 20, 30));
		assertEquals(30, max3(20, 10, 30));
		assertEquals(30, max3(10, 30, 20));
		assertEquals(30, max3(20, 30, 10));
		assertEquals(30, max3(30, 10, 20));
		assertEquals(30, max3(30, 20, 10));
	}
	
	// TODO: Schrijf grondige tests voor mediaan, verwissel, find, en sort.
	
	@Test
	void testTel() {
		assertEquals(0, tel(new int[] {10, 20, 30}, 15));
		assertEquals(1, tel(new int[] {10, 20, 30}, 20));
		assertEquals(2, tel(new int[] {10, 20, 30, 20}, 20));
		assertEquals(3, tel(new int[] {10, 20, 10, 30, 10}, 10));
	}
	
	@Test
	void testVerhoogElement() {
		int[] mijnArray = {10, 20, 30};
		verhoogElement(mijnArray, 1, 5);
		assertArrayEquals(new int[] {10, 25, 30}, mijnArray);
	}
	
	@Test
	void testNegatie() {
		int[] mijnArray = {10, -20, 30};
		negatie(mijnArray);
		assertArrayEquals(new int[] {-10, 20, -30}, mijnArray);
	}
 
}
 