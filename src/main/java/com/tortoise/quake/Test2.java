package com.tortoise.quake;

public class Test2 {

	private void sort(int[] arr, int low, int high){
		int l=low;
		int h=high;
		int povit=arr[low];
		 
		while(l<h){
			while(l<h&&arr[h]>=povit)
				h--;
			if(l<h){
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				l++;
			}
		 
			while(l<h&&arr[l]<=povit)
				l++;
		 
			if(l<h){
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				h--;
			}
		 }
		
		 if(l>low)sort(arr,low,l-1);
		 if(h<high)sort(arr,l+1,high);
		 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test = new Test2();
		int[] arr = {1,3,6,5,3,7,8,2,1,9};
		test.sort(arr, 0, arr.length-1);
		System.out.println(arr.toString());
	}

}
