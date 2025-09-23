// Write a function to search for an element in an array using linear search.

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 8, 10, 12, 16, 20, 40 };
        int target = 20;
        int result = linearSearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }
}