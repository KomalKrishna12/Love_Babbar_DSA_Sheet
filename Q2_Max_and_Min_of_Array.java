import java.util.Arrays;

public class Q2_Max_and_Min_of_Array {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 6, 2};
        
        // method 1
        // sort the array
        // after sorting first element of array will be min and last will be max if array is sorted
        // in ascending order
        // Arrays.sort(arr);
        // System.out.println("max : " + arr[arr.length - 1] + ", min : " + arr[0]);

        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("max : " + max + ", min : " + min);
    }
}
