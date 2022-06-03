// we have given an array which consists of elements 0s, 1s and 2s
// we're required to sort the array without using any sorting algorithm
// we use dutch algo in which we use three pointer low, mid and high
// from (0, low-1) we all have 0s as element
// from (high+1 to end) we all have 2s
// mid is use traverse in the array
// whenever 0 encounter swap it with low and increse both
// when 1 encounter simply increament mid
// when 2 encounter swap mid value with high and decrease high only
// becoz mid value is swapped and we don't know either it is 0 or 1 so we only move high pointer
public class Q4_Sort_an_array_of_0s_1s_2s{
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(mid, low, arr);
                mid++;
                low++;
            }
            else if(arr[mid] == 1) mid++;
            else {
                swap(mid, high, arr);
                high--;
            }
        }

        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}