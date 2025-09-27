public class BinarySearchOA {
    public static int OrderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[end] > arr[start];

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1; 
                }
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Descending array
        int[] arr = { 80, 70, 60, 40, 35, 29, 18, 15, 10, 6 };
        // // Ascending array
        // int[] arr1 = { 6, 10, 15, 18, 29, 35, 40, 60, 70, 80 };

        int target = 6;
        int result = OrderAgnosticBinarySearch(arr, target);
        
        if (result >= 0) {
            System.out.println("Element is found at " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
