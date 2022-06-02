import java.util.Arrays;

public class Q2_Max_and_Min_of_Array {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 6, 2};
        
        Arrays.sort(arr);

        System.out.println("max : " + arr[arr.length - 1] + ", min : " + arr[0]);
    }
}
