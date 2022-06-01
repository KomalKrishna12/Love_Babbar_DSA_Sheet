public class Q1_Reverse_the_Array{
    public static void swap(int li, int ri, int[] arr){
        int temp = arr[li];
        arr[li] = arr[ri];
        arr[ri] = temp;
    }

    public static void reverseArray(int[] arr, int li, int ri){
        if(li >= ri) return;
        swap(li, ri, arr);
        reverseArray(arr, li+1, ri-1);
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2};

        // iterative
        // for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        // int li = 0, ri = arr.length - 1;

        // while(li < ri){
        //     swap(li, ri, arr);
        //     li++;
        //     ri--;
        // }

        // System.out.println();

        // for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");


        // recursion
        reverseArray(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

    }
}