package ds.concepts.searching;

public class BinarySearch {
    /**
     * Iterative way of binary search
     * @param array
     * @param key
     * @return element found on index 
     */
    public final static int binarySearch(int[] array, int key){
        int lowerIndex = 0;
        int rightIndex = array.length-1;
        while (lowerIndex < rightIndex) {
            int midIndex = lowerIndex + (rightIndex-1)/2;

            // check KEY value is present at middle index
            if(array[midIndex] == key){
                return midIndex;
            }

            // if KEY is greater than middleIndex value then ignore left half values.
            if(array[midIndex] < key){
                lowerIndex = midIndex + 1;
            }

            // if KEY is smaller than middleIndex value than inore right half values.
            if(array[midIndex] > key){
                rightIndex = midIndex-1;
            }

        }
        //return -1, f element is not found in the given array.
        return -1;
    }
}