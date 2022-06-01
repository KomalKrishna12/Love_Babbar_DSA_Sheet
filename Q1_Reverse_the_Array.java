public class Q1_Reverse_the_Array{
    public static void swap(int li, int ri, int[] arr){
        int temp = arr[li];
        arr[li] = arr[ri];
        arr[ri] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2};

        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        int li = 0, ri = arr.length - 1;

        while(li < ri){
            swap(li, ri, arr);
            li++;
            ri--;
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

    }
}