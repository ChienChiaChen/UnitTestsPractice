package chiachen.example.com.unittestpractice;

import android.test.AndroidTestCase;

/**
 * Created by Jason_Chien on 2017/6/15.
 */

public class MyMathTest extends AndroidTestCase {
	//Android Instrumentation Tests
	public void test_add_first_1_second_2_equals_3(){
		//arrange 初始化
		int first = 1;
		int second = 2;
		int expect = 3;
		MyMath myMath = new MyMath();
		
		//act 執行測試動作
		int actual = myMath.add(first, second );
		
		//assert 驗證
		assertEquals(expect, actual);
	}
	
}
