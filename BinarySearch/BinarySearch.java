//main class function
public class BinarySearch {
    // method for binarysearch
    //specify the array data type in the parameters
    public static int binarySearch(int[] arr, int target) {
        //start or low as first element
        int start = 0;
        // end or high element 
        // length of array will always be +1 of the array index 
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                //search on right side
                start = mid + 1;
            } else {
                //search on left side
                end = mid - 1;
            }
        }
        return -1;

    }

    // initially running method
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 10, 16, 18, 40 };
        int target = 40;

        //returning the function results into result variable 
        int result = binarySearch(arr, target);

        //if the result is greater than or equal to 0 then the element is found otherwise not found
        if (result >= 0) {
            System.out.println("Element found at " + result + " " + arr[result]);
        } else {
            System.out.println("Element not found");
        }
    }
}
