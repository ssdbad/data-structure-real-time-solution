package ds.concepts.sorting;

public class MergeSort {
    public void sort(int[] array, int left, int right){
        if(left<right){
            // find the middle point
            int middle = left + (right-left)/2;
            //Sort first and second halves
            sort(array, left, middle);
            sort(array, middle+1, right);
            //Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    void merge(int[] array, int left, int middle, int right) {
        // find sizes of two sub-arrays to be merged.
        int n1 = middle - left + 1;
        int n2 = right - middle;

        //create temp arrays.
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = array[left+i];
        for (int i = 0; i < n2; i++) {
            R[i] = array[middle+1+i];
        }

        /**Merge the temp arrays*/
        //Initial indexes of first and second arrays.
        int i = 0, j = 0 ;
        //Initial indexes of merged subarray array.
        int k = left;
        while (i < n1 && j <n2) {
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /**Copy remaining elements of L[] if any*/
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /**Copy remaining elements of R[] if any*/
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}