package sort;

import java.util.Random;

public class Sort {
	
	private Random random;
	private int[] arr;
	
	public Sort() {
		this.random = new Random();
	}
	
	public int[] getArray(int index) {
		
		
		this.arr = new int[index];
		for(int i = 0; i < arr.length; i++) {
			this.arr[i] = random.nextInt(99)+1;
			
			for(int j=1; j < i; j++) {
				
				if(this.arr[i] == this.arr[j]) {
					
					i--;
					
				}
				
				
			}
			
		}
		
		return this.arr;
		
	}
	
	public void printArray() {
		
		for(int i=0; i<this.arr.length; i++) {
			System.out.print(this.arr[i]+" ");
		}
		
	}
	
	// 선택정렬 selectionSort
	public void selectSort(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
				
			for(int j = i; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) { //오름차순
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
	}
	// 삽입정렬 insertionSort
	public void insertSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			
			int target = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && target < arr[j]) {
				
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = target;
		}
		
	}
	// 버블정렬 bubbleSort
	public void bubbleSort(int[] arr) {
		
		for(int i = arr.length - 1; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
			
		}
		
		
	}
	
}
	
	

	
