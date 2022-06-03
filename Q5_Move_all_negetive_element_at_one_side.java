public class Q5_Move_all_negetive_element_at_one_side {
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] < 0){
                swap(i, j, arr);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        for(int ii = 0; ii < arr.length; ii++) System.out.print(arr[ii] + " ");
    }
}
