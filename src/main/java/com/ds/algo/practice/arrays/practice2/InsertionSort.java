package com.ds.algo.practice.arrays.practice2;

public class InsertionSort {
	public static void main(String... s) {
		int ar[] = { 6, 5, 4, 3, 2, 1 };
		insertionSort(ar);
		//bubbleSort(ar);
	}
	public static void insertionSort(int ar[])
	{
		for(int i=1;i<ar.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(ar[j]<ar[j-1])
				{
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
			}
		}
		for(int i:ar)
			System.out.print(i+" ");
	}
	
	public static void insertionSort2(int ar[])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(ar[j]<ar[j-1])
				{
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
			}
		}
		for(int i:ar)
			System.out.print(i+" ");
	}
}
