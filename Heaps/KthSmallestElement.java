package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {
	
	public int kLarge(int[] arr, int k) {
		PriorityQueue<Integer>  maxHeap = new PriorityQueue<>();
		for(int i =0; i< arr.length; i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size() > k) 
				maxHeap.remove();
		}
		
		return maxHeap.remove();
	}
	
	public int kSmall(int[] arr, int k) {
		PriorityQueue<Integer>  maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i =0; i< arr.length; i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size() > k) 
				maxHeap.remove();
		}
		
		return maxHeap.remove();
	}

}
