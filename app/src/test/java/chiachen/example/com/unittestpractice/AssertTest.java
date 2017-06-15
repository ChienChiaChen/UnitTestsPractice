package chiachen.example.com.unittestpractice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jason_Chien on 2017/6/15.
 */

public class AssertTest {
	@Test
	public void sample_assert_same(){
		//arrange
		Object expect = new Object();
		Object expectNotSame = new Object();
		Object actual = expect;
		
		//assert
		Assert.assertSame(expect, actual);
		Assert.assertNotSame(expectNotSame, actual);
	}
	
	@Test
	public void sample_assert_not_null(){
		//arrange
		Object expectNull = null;
		Object expectNotNull = new Object();
		
		//assert
		Assert.assertNull(expectNull);
		Assert.assertNotNull(expectNotNull);
	}
	
	@Test
	public void sample_assert_true(){
		//init
		boolean b1 = true;
		boolean b2 = false;
		
		Assert.assertTrue(b1);
		Assert.assertFalse(b2);
	}
	
	@Test
	public void sample_assert_array(){
		int[] expect = new int[]{1, 2, 3};
		int[] actual = new int[]{1, 2, 3};
		
		Assert.assertArrayEquals(expect, actual);
	}
	
	@Test
	public void sample_assert_collection(){
		List<Integer> expect = Arrays.asList(1, 2, 3);
		List<Integer> actual = Arrays.asList(1, 2, 3);
		
		Assert.assertEquals(expect, actual);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void sample_assert_exception() {
		int[] sampleArr = new int[] {1, 2, 3};
		
		int indexOutOfBoundNumber = sampleArr[3];
	}
	
	@Test (expected = NumberFormatException.class)
	public void sample_assert_exception_null_pointer() {
		String str1 = null;
		int i = Integer.valueOf(str1);
		
	}
	
}
