package ds.concepts;

import java.util.HashMap;
import java.util.Map;

import ds.concepts.sorting.MergeSort;

public class Drive_DataStructure {

	public static void main(String[] args) {
		int[ ] array = {12,9,13,8,14,7,15,6,16};
		MergeSort mergeSort = new MergeSort();
		System.out.println("Input Array : ");
		MergeSort.printArray(array);

		System.out.println("Sorted Array : ");
		mergeSort.sort(array, 0, array.length-1);
		MergeSort.printArray(array);
		
	}

}
