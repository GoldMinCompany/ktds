package sort;

public class SortMain {

	public static void main(String[] args) {
		
		Sort sort = new Sort();
		int[] arr1 = sort.getArray(30);
		System.out.println("정렬 전");
		sort.printArray();
		
		System.out.println("\n");
		System.out.println("선택정렬 후");
		sort.selectSort(arr1);
		sort.printArray();
		
		
		int [] arr2 = sort.getArray(30);
		System.out.println("\n");
		System.out.println("정렬 전");
		sort.printArray();
		
		
		System.out.println("\n");
		System.out.println("삽입정렬 후");
		sort.insertSort(arr2);
		sort.printArray();
		
		int [] arr3 = sort.getArray(30);
		System.out.println("\n");
		System.out.println("정렬 전");
		sort.printArray();
		
		System.out.println("\n");
		System.out.println("버블정렬 후");
		sort.bubbleSort(arr3);;
		sort.printArray();
	}

}
