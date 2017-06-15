package chiachen.example.com.unittestpractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Jason_Chien on 2017/6/15.
 */

public class SampleTest {
	// @Test : 表示要執行此區段裡的測試碼
	// @BeforeClass : 在開始第一個測試前執行
	// @AfterClass : 全部測試完畢後執行
	// @Before : 每次測試前執行
	// @After : 每次測試後執行
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("beforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@Test
	public void test1(){
		System.out.println("test1");
	}
	
	// @Test
	// public void test2(){
	// 	System.out.println("test2");
	// }
	
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() throws Exception{
		System.out.print("AfterClass");
	}
}
