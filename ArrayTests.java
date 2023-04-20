import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3};
    int[] input2 = {};
    int[] input3 = {1, 2, 3, 4};
    int[] input4 = {1, 2, 3};
    int[] input5 = {1, 2};

    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    
    ArrayExamples.reverseInPlace(input5);
    assertArrayEquals(new int[]{ 2, 1 }, input5);

    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ }, input2);

    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input3);

    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{3, 2, 1}, input4);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = { 3 };
    int[] input3 = {1, 2, 3, 4};
    int[] input4 = {1, 2, 3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest() {
   
    double[] input3 = {1.5, 1.5, 2.5, 3.6, 4.8};
    double actual = ArrayExamples.averageWithoutLowest(input3);
    assertEquals(2.18, actual, 0);
    
  }
}
