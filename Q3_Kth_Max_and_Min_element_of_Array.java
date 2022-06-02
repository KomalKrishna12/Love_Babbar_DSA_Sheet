// kth is an integer suppose arr : {4, 0, 5, 2, 1} and k is 2 
// means we want 2nd max and min element of array
// after sorting array become {0, 1, 2, 4, 5}
// 2nd min arr[0 + k - 1] (k-1) because arr[0] is first so now rest will be k-1
// arr[0 + 2 - 1] = arr[1] = 1
// for max arr[(n - 1) (2 - 1)] = arr[4 - 1] = arr[3] = 2
import java.util.*;
public class Q3_Kth_Max_and_Min_element_of_Array {

    public static void main(String[] args) {
        int[] arr = {4, 0, 5, 2, 1};
        int k = 3;

        Arrays.sort(arr);

        System.out.println("max : " + arr[arr.length - 1 - (k - 1)]);
        System.out.println("min : " + arr[0 + (k - 1)]);
    }

}
