import java.util.Arrays;

class Solution {

    static int[] pancakeSort(int[] arr) {
        for(int i = arr.length ; i > 0; i--) {
            int max = findMax(arr, i);
            flip(arr, max);
            flip(arr, i - 1);
        }

        return arr;
    }

    static int findMax(int[] arr, int k) {
        int indexOfMax = 0;
        for(int i = 0; i < k; i++){
            if(arr[indexOfMax] < arr[i]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    static private int[] flip(int[] arr, int k) {
        if(k >= arr.length) {
            return arr;
        } else {
            int start = 0, end = k;
            while(start < end) {
                swap(arr, start++, end--);
            }
            return arr;
        }
    }

    static private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 2};

        System.out.println(Arrays.toString(pancakeSort(arr)));
    }

}