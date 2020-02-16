package com.ds.algo.practice.arrays.practice2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

	BinarySearch search;
	
	@Before
	public void setup()
	{
		search= new BinarySearch();
	}

	@Test
	public void test_binarySearch_when_even_numbers_and_middle_elements()
	{
		int ar[]= {1,2,3,4,5,6};
		int actualPosition=search.binarySearch(ar, 3);
		assertEquals(3, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_even_numbers_and_middle_elements2()
	{
		int ar[]= {1,2,3,4,5,6};
		int actualPosition=search.binarySearch(ar, 4);
		assertEquals(4, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_odd_numbers_and_middle_elements()
	{
		int ar[]= {1,2,3,4,5};
		int actualPosition=search.binarySearch(ar, 3);
		assertEquals(3, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_odd_numbers_and_first_element()
	{
		int ar[]= {1,2,3,4,5};
		int actualPosition=search.binarySearch(ar, 1);
		assertEquals(1, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_odd_numbers_and_last_element()
	{
		int ar[]= {1,2,3,4,5};
		int actualPosition=search.binarySearch(ar, 5);
		assertEquals(5, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_even_numbers_and_first_element()
	{
		int ar[]= {1,2,3,4,5,6};
		int actualPosition=search.binarySearch(ar, 1);
		assertEquals(1, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_even_numbers_and_last_element()
	{
		int ar[]= {1,2,3,4,5,6};
		int actualPosition=search.binarySearch(ar, 6);
		assertEquals(6, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_even_numbers_and_no_element()
	{
		int ar[]= {1,2,3,4,5,6};
		int actualPosition=search.binarySearch(ar, 7);
		assertEquals(-1, actualPosition);
	}
	
	@Test
	public void test_binarySearch_when_odd_numbers_and_no_element()
	{
		int ar[]= {1,2,3,4,5};
		int actualPosition=search.binarySearch(ar, 7);
		assertEquals(-1, actualPosition);
	}

}
