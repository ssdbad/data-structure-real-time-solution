package ds.concepts.sorting;

public class QuickSort {
    /**The sort method that implements Quick sort
     * array[] to be sorted
     * low --> starting index
     * high --> last index
    */
    public static void sort(int[] array, int low, int high){
        if(low<high){
            //pi is partitioning index, array[pi] is not at right end
            int pi = partition(array, low, high);
            //Seperately sort elements before partition and after partition
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        /** This method takes the last element as pi, places the pi at it's correct position
         * in sorted array and places all smaller (smaller than pi) to left of pi and all greater
         * elements are right of pi
        */
            int pi = array[high];
            // Index of smaller element and indicates the right position of pi found so far.

            int i = low-1;

            for (int j = low; j < high-1; j++) {
                //if current element is smaller than pi
                if(array[j] < pi){
                    //increment index of smaller element
                    i++;
                    swap(array, i, j);
                }
            }
            swap(array, i+1, high);

        return i+1;
    }

    //utility method to perform swapping
    private static void swap(int[] array, int i, int high) {
        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;
    }
    
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}