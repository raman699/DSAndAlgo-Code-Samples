package searching;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchCeilAndFloorTest {

	@Test
	public void test_ceil_search_when_element_is_at_middle_position() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 10);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_less_than_the_lowest_element_present_in_the_array() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 0);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_greater_than_the_largest_element_present_in_the_array() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 20);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_greater_than_the_middle_element() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 12);
		int expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_less_than_the_middle_element() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 2);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_at_last() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 19);
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_at_first() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 1);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_between_mid_and_mid_minus_one() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 9);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ceil_search_when_element_is_between_mid_and_plus_minus_one() {
		int ar[] = { 1, 2, 8, 10, 12, 12, 19 };
		int actual = SearchCeilAndFloor.ceilSearch(ar, 0, ar.length - 1, 11);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void test_floor_search_when_element_is_at_middle_position() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.floorSearch(ar, 0, ar.length - 1, 10);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void test_floor_search_when_element_is_less_than_the_lowest_element_present_in_the_array() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.floorSearch(ar, 0, ar.length - 1, 0);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_floor_search_when_element_is_greater_than_the_largest_element_present_in_the_array() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.floorSearch(ar, 0, ar.length - 1, 20);
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void test_floor_search_when_element_is_greater_than_the_middle_element_present_in_array() {
		int ar[] = { 1, 2, 8, 10, 12, 13, 19 };
		int actual = SearchCeilAndFloor.floorSearch(ar, 0, ar.length - 1, 12);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void test_floor_search_when_element_is_less_than_the_middle_element_present_in_array() {
		int ar[] = { 1, 2, 8, 10, 12, 13, 19 };
		int actual = SearchCeilAndFloor.floorSearch(ar, 0, ar.length - 1, 8);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_floor_search_when_element_is_between_mid_and_mid_minus_one() {
		int ar[] = { 1, 2, 8, 10, 11, 12, 19 };
		int actual = SearchCeilAndFloor.floorSearch(ar, 0, ar.length - 1, 9);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_floor_search_when_element_is_between_mid_and_mid_plus_one() {
		int ar[] = { 1, 2, 8, 10, 12, 12, 19 };
		int actual = SearchCeilAndFloor.floorSearch(ar, 0, ar.length - 1, 11);
		int expected = 3;
		assertEquals(expected, actual);
	}
}
