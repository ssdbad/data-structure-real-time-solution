package interviewPrep.round_two.stock_exchange_problems;

/**
 * Maximum difference between two elements such that larger element appears after the smaller number
 * Input : arr = {2, 3, 10, 6, 4, 8, 1}
 * Output : 8 
 * Explanation : The maximum difference is between 2 and 10.
 * 
 * Input : arr = {7, 9, 5, 6, 3, 2}
 * Output : 2
 * Explanation : The maximum difference is between 7 and 9.
 */
public class MaximumDifference {

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        MaxDiffMethods maxDiffMethods = new MaxDiffMethods();
        int result = -1;
        result = maxDiffMethods.naiveApproach(arr, arr.length);
        System.out.println("Naive Approach : "+result);
        result = maxDiffMethods.efficientApproach(arr, arr.length);
        System.out.println("Efficient Approach : "+result);
    }
}

class MaxDiffMethods{
    /**
     * Time Complexity O(n^2)
     * Space Complexity O(1)
     * @param arr
     * @param length
     * @return
     */
    public int naiveApproach(int[] arr, int length) {
        //arr = {2, 3, 10, 6, 4, 8, 1}
        if(length==1) return arr[0];
        int maxdiff = arr[1] - arr[0];
        for(int i =0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[j]-arr[i]>maxdiff)
                maxdiff = arr[j] - arr[i];
            }
        }
        return maxdiff;
    }

    /**
     * Time Complexity O(n)
     * Space Complexity O(1)
     * @param arr
     * @param length
     * @return
     */
    public int efficientApproach(int[] arr, int length){
        int maxDiff = arr[1]-arr[0]; // initializing maxDiff by comparing first two element
        int minElement = arr[0]; // initializing minElement with first index element
        int i = 0;//initalizing loop outside
         //arr = {2, 3, 10, 6, 4, 8, 1}
        for(i=1; i<length; i++){
            //started traversing loop, and compare existing maxDiff is lesser than 
            //(array_next_element - existing minElement) or not ?
            if(arr[i]-minElement > maxDiff) 
            //if maxDiff is true in previous condition, 
            //then maxDiff will be reassigned with (array_next_element - existing minElement)
            maxDiff = arr[i]-minElement;
            //now comapring minElement is greater than array_next_element or not ? 
            if(arr[i] < minElement)
            //if previous condition is true then minElement will be reassigned with array_next_element
            minElement = arr[i];
        }
        // return maxmimum difference (maxDiff)
        return maxDiff;
    }

}