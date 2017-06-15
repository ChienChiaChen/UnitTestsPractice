package chiachen.example.com.unittestpractice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jason_Chien on 2017/6/15.
 * https://hungyanbin.gitbooks.io/android-unit-test/content/chapter2.html
 */

public class MyMathTest {

	// @Test : 表示要執行此區段裡的測試碼
	// @BeforeClass : 在開始第一個測試前執行
	// @AfterClass : 全部測試完畢後執行
	// @Before : 每次測試前執行
	// @After : 每次測試後執行

	@Test
	public void add_first_1_second_2_equals_3(){
		//arrange
		int first = 1;
		int second = 2;
		int expect = 3;
		MyMath myMath = new MyMath();
		
		//act
		int actual = myMath.add(first, second);
		
		//assert
		Assert.assertEquals(expect, actual);
	}
}
