package chiachen.example.com.unittestpractice;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by Jason_Chien on 2017/6/15.
 */

public class MatcherAssertTest {
	@Test
	public void one_add_one_equals_two(){
		int expect = 2;
		int actual = 1 + 1;
		
		assertThat(actual, is(expect));
	}
	
	@Test
	public void array_hasItems_element_1_5(){
		List<Integer> integerArray = Arrays.asList(1, 2, 3, 5);
		
		assertThat(integerArray, hasItems(1, 5));
	}
	
	@Test
	public void test_iterable(){
		List<Integer> integerArray = Arrays.asList(1, 2, 3, 5);
		
		assertThat(integerArray, Matchers.contains(1, 2, 3, 5));
		assertThat(integerArray, Matchers.hasItem(1));
		assertThat(integerArray, Matchers.containsInAnyOrder(5, 3, 1, 2));
		assertThat(integerArray, Matchers.hasSize(4));
	}
	
	@Test
	public void test_map(){
		Map<String, String> stringMap = new HashMap<>();
		stringMap.put("key1", "value1");
		stringMap.put("key2", "value2");
		stringMap.put("key3", "value3");
		
		assertThat(stringMap, Matchers.hasKey("key1"));
		assertThat(stringMap, Matchers.hasValue("value2"));
		assertThat(stringMap, Matchers.hasEntry("key3", "value3"));
	}
	
	@Test
	public void test_condition(){
		assertThat("Condition", Matchers.allOf(Matchers.startsWith("Con"), Matchers.containsString("iti")));
		assertThat("Condition", Matchers.anyOf(Matchers.startsWith("Cond"), Matchers.startsWith("iti")));
		assertThat("Condition", Matchers.not(Matchers.startsWith("tion")));
	}
}
