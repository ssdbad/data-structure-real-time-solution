package ds.concepts;

import ds.concepts.sorting.MergeSort;
import ds.concepts.sorting.QuickSort;

public class Drive_DataStructure {

	public static void main(String[] args) {
		int[ ] array = {12,9,13,8,14,7,15,6,16};
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		System.out.println("Input Array : ");
		MergeSort.printArray(array);
		quickSort.printArray(array);
		System.out.println("Sorted Array : ");
		mergeSort.sort(array, 0, array.length-1);
		MergeSort.printArray(array);
		quickSort.printArray(array);
	}
}