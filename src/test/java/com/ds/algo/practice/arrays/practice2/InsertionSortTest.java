package com.ds.algo.practice.arrays.practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testInsertionSort2_normal() {
		int ar[]= {5,4,3,2,1};
		InsertionSort.insertionSort2(ar);
		int expected[]= {1,2,3,4,5};
		assertArrayEquals(expected, ar);
	}
	
	@Test
	public void testInsertionSort_normal() {
		int ar[]= {5,4,3,2,1};
		InsertionSort.insertionSort(ar);
		int expected[]= {1,2,3,4,5};
		assertArrayEquals(expected, ar);
	}

}
