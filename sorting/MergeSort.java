package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public int[] mergesort(int[] arr) {
		sort(arr, 0, arr.length - 1);
		for (int l =0 ; l<arr.length; l++) {
			System.out.print(arr[l] + ", ");
		}
		return arr;
	}
	
	public void sort(int arr[], int start, int end) {
		if(start< end) {
			int mid = (start+ end)/2;
			sort(arr, start, mid);
			sort(arr, mid +1, end);
			merge(arr, start, mid, end);
		}
		
	}
	
//	public void merge(int arr[], int start,int mid,  int end) {
//		int temp[] = new int[end -start +1];
//		
//		int i= start; int j = mid + 1;
//		int k=0;
//		while (i<=mid && j <=end) {
//			if(arr[i]< arr[j]) {
//				temp[k] = arr[i];
//				i++; 
//			} else {
//				temp[k] = arr[j];
//				j++; 
//			}
//			k++;
//		}
//		
//		while(i<=mid) {
//			temp[k] = arr[i];
//			i++; k++;
//		}
//		
//		while (j<=end) {
//			temp[k] = arr[j];
//			j++; k++;
//		}
//		
//		for (int l =start ; l<=end; l++) {
//			arr[l] = temp[l-start];
//		}
//		
//	}
	
	
	public void merge(int arr[], int start,int mid,  int end) {
		
		int i= start; int j = mid + 1;
		int element =0;
		while (i<=mid && j <=end) {
			if(arr[i]< arr[j]) {
				i++; 
			} else {
				element = arr[j];
    			while(j >= 0 && element <=  arr[j]) {
    				arr[j+1] = arr[j];
    				j--;
    			}
    			arr[i] = element;
    			j++; 
			}
		}
		
		
	}
	
	

}
