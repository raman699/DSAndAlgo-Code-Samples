package com.ds.algo.practice.arrays.practice2;

public class BinarySearch {

	public int binarySearch(int ar[],int x)
	{
		int beg=0,end=ar.length-1;
		int mid =(beg+end)/2;
		
		while(beg<=end)
		{
			mid =(beg+end)/2; 
			
			if(ar[mid]==x)
			{
				return mid+1;
			}
			else if(ar[mid]<x)
			{
				beg= mid+1;
			}
			else if(ar[mid]>x)
			{
			end= mid-1;
			}

		}
		return -1;
	}
}
