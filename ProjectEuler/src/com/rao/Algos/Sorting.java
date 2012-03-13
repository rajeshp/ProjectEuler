package com.rao.Algos;

public class Sorting {

	
	
	public int[] BubbleSort(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]>arr[j])
				  swap(arr,i,j);
				
			}
			
		}
		
		
		return arr;
	}
	
	public void swap(int[] arr,int i,int j)
	{
		arr[i]+=arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
	}
	
	
	public static void main(String[] args)
	{
		
		Sorting objSorting = new Sorting();
		
		objSorting.BubbleSort(new int[]{4,5,3,1,7,2});
		
	}
	
	
}
