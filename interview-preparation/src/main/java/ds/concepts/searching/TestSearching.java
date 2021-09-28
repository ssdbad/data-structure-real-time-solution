package ds.concepts.searching;

import ds.utility.input.ArrayInput;

public class TestSearching {
    public static void main(String[] args) {
//      {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int index = BinarySearch.binarySearch(ArrayInput.SORTED_NATURAL_NUMBERS, 10);
        // if index = -1 then number is not available in the array.
        System.out.println("Found at index : "+index);
    }
}
